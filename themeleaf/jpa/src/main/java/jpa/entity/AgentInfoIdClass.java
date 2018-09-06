package jpa.entity;

import java.io.Serializable;

/**
 * @author hylexus
 * createdAt 2018/3/21
 */
public class AgentInfoIdClass implements Serializable{
    private Integer cityId;

    private Integer agentId;

    public AgentInfoIdClass(){

    }

    public AgentInfoIdClass(Integer cityId, int agentId) {
        this.cityId = cityId;
        this.agentId = agentId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public AgentInfoIdClass setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public AgentInfoIdClass setAgentId(Integer agentId) {
        this.agentId = agentId;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentInfoIdClass{");
        sb.append("cityId=").append(cityId);
        sb.append(", agentId=").append(agentId);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AgentInfoIdClass that = (AgentInfoIdClass) o;

        if (!cityId.equals(that.cityId)) {
            return false;
        }
        return agentId.equals(that.agentId);
    }

    @Override
    public int hashCode() {
        int result = cityId.hashCode();
        result = 31 * result + agentId.hashCode();
        return result;
    }
}
