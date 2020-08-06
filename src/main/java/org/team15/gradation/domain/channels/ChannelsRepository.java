package org.team15.gradation.domain.channels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ChannelsRepository extends JpaRepository<Channels, Long> {

    @Query
    List<Channels> findByUserId(String user_id);

    @Override
    Optional<Channels> findById(Long aLong);
}
