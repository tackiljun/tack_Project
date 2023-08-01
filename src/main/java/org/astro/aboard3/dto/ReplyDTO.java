package org.astro.aboard3.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReplyDTO {

    //////////////////////
    private long rno;

    @NotNull
    private long bno;

    @NotEmpty
    private String reply;

    @NotEmpty
    private String replyer;

    @Builder.Default
    private long gno = 0L;

    private int step;
    
}
