import java.math.BigDecimal;

public class RecordHolder {
    record Bet(String id, String userId, BigDecimal amount) {}
    record Round(String id) {}
    record BetResult(String id, String betId, String result) {}
}
