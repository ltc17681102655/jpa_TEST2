package controller;

import domain.ResponseData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileController {


    @Value("${filePath}")
    private String filePath;

    @RequestMapping("/upload")
    public String fileUpload(@RequestParam("head_img") MultipartFile file, HttpServletRequest request) {
        //file.isEmpty(); 判断图片是否为空
        //file.getSize(); 图片大小进行判断

        //head_img  js字段名
        String name = file.getName();
        System.out.println(name);
        //图片原始名
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        //.png 后缀名
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);

        fileName = UUID.randomUUID() + suffix;

        File destFile = new File(filePath + fileName);
        try {
            file.transferTo(destFile);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    @RequestMapping("json_convert")
    public ResponseData json() {

        return new ResponseData(1, "success");
    }

    @RequestMapping("devtool")
    public void devtools() {

        System.out.println("hello word");
    }

    @RequestMapping("trigger")
    public void trigger() {

        System.out.println("hello word");
    }
}
