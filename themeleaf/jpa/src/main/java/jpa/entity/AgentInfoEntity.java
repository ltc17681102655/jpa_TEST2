package jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

/**经纪人公司
 * @author hylexus
 * createdAt 2018/3/21
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "agent_info")
@IdClass(AgentInfoIdClass.class)
public class AgentInfoEntity implements Serializable {

    @Id
    @Column(name = "city_id")
    private Integer cityId;

    @Id
    @Column(name = "agent_id")
    private Integer agentId;

    @Column(name = "agent_name")
    private String agentName;

    @Column(name = "agent_shortname")
    private String agentShortname;

    @Column(name = "if_ka")
    private Integer ifKa;

    @Column(name = "district_id")
    private Integer districtId;

    @Column(name = "key_person")
    private String keyPerson;

    @Column(name = "kp_position")
    private String kpPosition;

    @Column(name = "address")
    private String address;

    @Column(name = "contactinfo")
    private String contactinfo;

    @Column(name = "memo")
    private String memo;

    @Column(name = "status")
    private Integer status;

    /**
     * 成立的年份
     */
    @Column(name = "establish_year")
    private Integer establishYear;

    /**
     * 线下门店数量
     */
    @Column(name = "store_num")
    private Integer storeNum;
    /**
     * 品牌色系值
     */
    @Column(name = "color")
    private String color;
    /**
     * 是否是品牌经纪公司, 0:不是, 1:是
     */
    @Column(name = "if_brand")
    private Integer ifBrand;

    public Integer getCityId() {
        return cityId;
    }

    public AgentInfoEntity setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public AgentInfoEntity setAgentId(Integer agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getAgentName() {
        return agentName;
    }

    public AgentInfoEntity setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    public String getAgentShortname() {
        return agentShortname;
    }

    public AgentInfoEntity setAgentShortname(String agentShortname) {
        this.agentShortname = agentShortname;
        return this;
    }

    public Integer getIfKa() {
        return ifKa;
    }

    public AgentInfoEntity setIfKa(Integer ifKa) {
        this.ifKa = ifKa;
        return this;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public AgentInfoEntity setDistrictId(Integer districtId) {
        this.districtId = districtId;
        return this;
    }

    public String getKeyPerson() {
        return keyPerson;
    }

    public AgentInfoEntity setKeyPerson(String keyPerson) {
        this.keyPerson = keyPerson;
        return this;
    }

    public String getKpPosition() {
        return kpPosition;
    }

    public AgentInfoEntity setKpPosition(String kpPosition) {
        this.kpPosition = kpPosition;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public AgentInfoEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public AgentInfoEntity setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
        return this;
    }

    public String getMemo() {
        return memo;
    }

    public AgentInfoEntity setMemo(String memo) {
        this.memo = memo;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AgentInfoEntity setStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 获取成立的年份
     *
     * @return establish_year - 成立的年份
     */
    public Integer getEstablishYear() {
        return establishYear;
    }

    /**
     * 设置成立的年份
     *
     * @param establishYear 成立的年份
     */
    public AgentInfoEntity setEstablishYear(Integer establishYear) {
        this.establishYear = establishYear;
        return this;
    }

    /**
     * 获取线下门店数量
     *
     * @return store_num - 线下门店数量
     */
    public Integer getStoreNum() {
        return storeNum;
    }

    /**
     * 设置线下门店数量
     *
     * @param storeNum 线下门店数量
     */
    public AgentInfoEntity setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
        return this;
    }


    public String getColor() {
        return color;
    }

    public AgentInfoEntity setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getIfBrand() {
        return ifBrand;
    }

    public AgentInfoEntity setIfBrand(Integer ifBrand) {
        this.ifBrand = ifBrand;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentInfoEntity{");
        sb.append("cityId=").append(cityId);
        sb.append(", agentId=").append(agentId);
        sb.append(", agentName='").append(agentName).append('\'');
        sb.append(", agentShortname='").append(agentShortname).append('\'');
        sb.append(", ifKa=").append(ifKa);
        sb.append(", districtId=").append(districtId);
        sb.append(", keyPerson='").append(keyPerson).append('\'');
        sb.append(", kpPosition='").append(kpPosition).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", contactinfo='").append(contactinfo).append('\'');
        sb.append(", memo='").append(memo).append('\'');
        sb.append(", status=").append(status);
        sb.append(", establishYear='").append(establishYear).append('\'');
        sb.append(", storeNum='").append(storeNum).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", ifBrand='").append(ifBrand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
