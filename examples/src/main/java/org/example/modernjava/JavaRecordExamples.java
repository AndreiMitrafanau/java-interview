package org.example.modernjava;

import java.math.BigDecimal;

record Bet(String id, BigDecimal amount) {
        public Bet {
            if (amount.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException();
        }
}
