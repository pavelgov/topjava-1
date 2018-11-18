package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.util.Collection;
import java.util.Map;

public interface UserMealRepository {
    Meal save(Meal meal, Integer userId);

    boolean delete(Integer mealId, Integer userId);

     Meal get(Integer mealId, Integer userId);

    Map<Integer, Meal> getAll(Integer userId);
}
