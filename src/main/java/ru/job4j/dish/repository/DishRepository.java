package ru.job4j.dish.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.dish.model.Dish;

import java.util.*;

public interface DishRepository extends CrudRepository<Dish, Integer> {

    Collection<Dish> findAll();
}
