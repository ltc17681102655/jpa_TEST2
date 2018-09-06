package tuboshi9_4.vo.mingle;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Auther: ltc
 * @Date: 2018/7/20 9:46
 * @Description: 客户详情
 */
public class CustomerDetail {
    /**
     * 客户id
     */
    private Integer userId ;
    /**
     * 客户姓名
     */
    private String name;
    /**
     * 客户电话
     */
    private String mobile;
    /**
     * 购买客户时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm",timezone = "GMT+08")
    private Date buyCustomerTime;
    /**
     * 客户线索页链接
     */
    private String url ;
    /**
     * 客户房源信息
     */
    private CustomerEstate customerEstate ;

}
