package jpa.reporitory;

import jpa.entity.AgentInfoEntity;
import jpa.entity.AgentInfoIdClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentInfoReporitory extends JpaRepository<AgentInfoEntity,AgentInfoIdClass> {
}
