package tuboshi9_4.vo.mingle;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Auther: ltc
 * @Date: 2018/7/20 9:58
 * @Description: 客户房源
 */
public class CustomerEstate {

    private Integer cityId;
    private Integer houseId;
    private String houseName;
    /**
     * 最新报价(挂牌价)
     */
    private Integer totalPrice;
    /**
     * 单价
     */
    private Integer avgPrice;
    /**
     * 面积
     */
    private Integer area;
    /**
     * 几室几厅几卫
     */
    private String roomStructure;
    /**
     * 楼层
     */
    private String floorDesc;
    /**
     * 朝向
     */
    private String directionStr;
    /**
     * 建成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+08")
    private Date createTime;
    /**
     * 持有年限
     */
    private String holdYear;

}
