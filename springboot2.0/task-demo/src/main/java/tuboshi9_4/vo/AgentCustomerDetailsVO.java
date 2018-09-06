package tuboshi9_4.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import tuboshi9_4.vo.mingle.CustomerDetail;

import java.util.Date;
import java.util.List;

/**
 * @Auther: ltc
 * @Date: 2018/7/20 9:21
 * @Description: 经济人客户详情页信息
 */
public class AgentCustomerDetailsVO {
    /**
     * 经纪人的Id
     */
    private Integer brokerId;
    /**
     * 经纪人姓名
     */
    private String name;
    /**
     * 经纪人头像地址
     */
    private String headUrl;
    /**
     * 经纪人所在的公司
     */
    private String agentName;
    /**
     * 经纪人电话
     */
    private String mobile;
    /**
     * 最近登录时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm",timezone = "GMT+08")
    private Date loginTime;
    /**
     * 注册时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm",timezone = "GMT+08")
    private Date registTime;
    /**
     * 最近联系时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm",timezone = "GMT+08")
    private Date contactTime;
    /**
     * 最近购买时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm",timezone = "GMT+08")
    private Date buyTime;
    /**
     *客户详情列表
     */
    private List<CustomerDetail> customerDetails ;
}
