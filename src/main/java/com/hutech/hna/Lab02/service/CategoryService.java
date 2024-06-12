package com.hutech.hna.Lab02.service;


import com.hutech.hna.Lab02.model.Category;
import com.hutech.hna.Lab02.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryService {
    private final CategoryRepository catologyRepository;
    public List<Category> getAlCategories(){
        return catologyRepository.findAll();
    }
    public Optional<Category> getCategoryById(Long id) {
        return catologyRepository.findById(id);
    }
    public void addCategory(Category category) {
        catologyRepository.save(category);
    }
    public void updateCategory(@NotNull Category category) {
        Category existingCategory = catologyRepository.findById((long)
                        category.getId())
                .orElseThrow(() -> new IllegalStateException("Category with ID " +
                        category.getId() + " does not exist."));
        existingCategory.setName(category.getName());
        catologyRepository.save(existingCategory);
    }
    public void deleteCategoryById(Long id) {
        if (!catologyRepository.existsById(id)) {
            throw new IllegalStateException("Category with ID " + id + " does not exist.");
        }
        catologyRepository.deleteById(id);
    }

}
