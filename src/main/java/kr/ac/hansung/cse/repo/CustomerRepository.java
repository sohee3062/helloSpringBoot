package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

// 기존에 dao 코드를 작성하는 대신에 CrudRepository를 extends 하여 손쉽게 작성
public interface CustomerRepository extends CrudRepository<Customer, Long> {// <Class 이름, id의 type>
	
	List<Customer> findByLastName(String lastName); // 이렇게 함수 이름만 줘도 자동적으로 메소드 구현

}