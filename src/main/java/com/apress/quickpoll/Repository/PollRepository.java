package com.apress.quickpoll.Repository;

import com.apress.quickpoll.ObjectDomain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
