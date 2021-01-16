package com.wsb.junitdemo.exchange;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
class MoneyServiceTest {

    @Mock
    CurrencyService currencyService;

    @InjectMocks
    MoneyService moneyService;

    @Test
    void returns_amount_in_pln() {
        when(currencyService.getRate()).thenReturn(1.5f);

        assertAll("exchanges",
                () -> assertEquals(3f, moneyService.getInPLN(2f)),
                () -> assertEquals(0, moneyService.getInPLN(0f))
        );
    }
}