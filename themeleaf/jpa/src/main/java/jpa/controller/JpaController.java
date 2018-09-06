package jpa.controller;

import jpa.entity.AgentInfoEntity;
import jpa.reporitory.AgentInfoReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaController {


	@Autowired
	private AgentInfoReporitory agentInfoReporitory ;

	@RequestMapping("jpa")
	@Cacheable(value = "agent_info")
	public List<AgentInfoEntity> test(){
		Page<AgentInfoEntity> page = agentInfoReporitory.findAll(new PageRequest(1, 10, Sort.Direction.ASC, "agentId"));
		List<AgentInfoEntity> content = page.getContent();
		if (CollectionUtils.isEmpty(content)) {
			return null;
		}
		return content ;
	}

	@RequestMapping("redis_delete")
	@CacheEvict(value = "agent_info")
	public void test2(){


	}
}
