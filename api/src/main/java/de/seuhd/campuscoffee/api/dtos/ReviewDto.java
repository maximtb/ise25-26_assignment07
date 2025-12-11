package de.seuhd.campuscoffee.api.dtos;

import lombok.Builder;
import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NonNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto (
    @Nullable Long id,
    // TODO: Implement ReviewDto
    @Nullable LocalDateTime createdAt,
    @Nullable LocalDateTime updatedAt,
    @NotNull Long posId,
    @NotNull Long authorId,
    @NotNull
    @NotBlank
    @Size(min=1,max=200)
    String review,
    @Nullable Boolean approved

) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
