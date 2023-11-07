package lotto.Domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BonusNumberTest {
    @Test
    @DisplayName("음수를 받았을 경우")
    void createBonusNumber_Minus() {
        assertThatThrownBy(() -> new BonusNumber(-1, Arrays.asList(1,2,3,4,5,6)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("범위 밖의 수를 받은 경우")
    void createBonusNumber_Range() {
        assertThatThrownBy(() -> new BonusNumber(52, Arrays.asList(1,2,3,4,5,6)))
                .isInstanceOf(IllegalArgumentException.class);
    }

}