package org.team15.gradation.domain.channel;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long channel_id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String picture;

    @Builder
    public Channel(String title, String category, String picture) {
        this.title = title;
        this.category = category;
        this.picture = picture;
    }

    public void update(String title, String category, String picture){
        this.title = title;
        this.category = category;
        this.picture = picture;
    }
}
