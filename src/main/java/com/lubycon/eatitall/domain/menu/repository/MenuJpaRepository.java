package com.lubycon.eatitall.domain.menu.repository;

import com.lubycon.eatitall.domain.menu.dto.MenuDto;
import com.lubycon.eatitall.domain.menu.entity.Menu;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuJpaRepository extends JpaRepository<Menu, Long> {

  List<MenuDto> findMenusByRestaurantIdAndIsHidden(Long restaurantId, int isHidden);

  Optional<Menu> findByRestaurantIdAndSequenceNumber(Long restaurantId, int sequenceNumber);
}
