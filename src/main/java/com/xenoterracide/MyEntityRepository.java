package com.xenoterracide;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MyEntityRepository extends PagingAndSortingRepository<MyEntity, Long> {
}
