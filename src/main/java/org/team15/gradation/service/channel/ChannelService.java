package org.team15.gradation.service.channel;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.team15.gradation.domain.channel.ChannelRepository;
import org.team15.gradation.web.dto.ChannelSaveRequestDto;

@RequiredArgsConstructor
@Service
public class ChannelService {
    private final ChannelRepository channelRepository;

    @Transactional
    public Long save(ChannelSaveRequestDto requestDto){
        return channelRepository.save(requestDto.toEntity()).getChannel_id();
    }
}
