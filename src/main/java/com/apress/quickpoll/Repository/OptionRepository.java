package com.apress.quickpoll.Repository;


import com.apress.quickpoll.ObjectDomain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {

}
