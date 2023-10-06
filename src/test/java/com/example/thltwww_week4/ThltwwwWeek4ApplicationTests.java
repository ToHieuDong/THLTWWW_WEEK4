package com.example.thltwww_week4;

import com.example.daos.CandidateDao;
import com.example.entity.Candidate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class ThltwwwWeek4ApplicationTests {

	@Autowired
	private CandidateDao candidateDao;
	@Test
	void findById() {
		Candidate candidate = candidateDao.findById(UUID.fromString("2536442d-8a32-4acf-9dfc-7a4e25edb328"));
		Assertions.assertEquals(candidate.getFullName(), "gnood");
	}

	@Test
	void getAll() {
	}

}
