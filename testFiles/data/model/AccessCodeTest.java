package data.model;

import data.model.AccessCode;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AccessCodeTest {
    @Test
    public void testAccessCode() {
        AccessCode accessCode = new AccessCode("1200WER", LocalDateTime.now(), LocalDateTime.now().plusDays(1), true,null);
        String expected ="1200WER";
        accessCode.setAccesscode("1200WER");
        assertEquals(expected,accessCode.toString());
    }

    @Test
    public void testAccessCodeExpires() {
        LocalDateTime timeCodeIsIssued = LocalDateTime.now().minusDays(1);
        LocalDateTime codeExpiredTime = LocalDateTime.now().minusHours(1);
        AccessCode accessCode = new AccessCode("1200WER", timeCodeIsIssued, codeExpiredTime, true, null);

        assertTrue(accessCode.isExpired());
    }
    @Test
    public void testAccessCodeDeactiveCode() {
        LocalDateTime timeCodeIsIssued = LocalDateTime.now().minusDays(1);
        LocalDateTime codeExpiredTime = LocalDateTime.now().minusHours(1);
        AccessCode accessCode = new AccessCode("1200WER", timeCodeIsIssued, codeExpiredTime, false, null);
        accessCode.deactivateCode();
        assertFalse(accessCode.isActive());
    }
    @Test
    public void testGettersMethods() {
        LocalDateTime timeCodeIsIssued = LocalDateTime.now().minusDays(0);
        LocalDateTime codeExpiredTime = LocalDateTime.now().minusDays(1);
        AccessCode accessCode = new AccessCode("1200WER", timeCodeIsIssued, codeExpiredTime,true,null);
        assertEquals(timeCodeIsIssued, accessCode.getTimeIssued());
        assertEquals(codeExpiredTime, accessCode.getExpiredTime());
        assertTrue(accessCode.isActive());


    }
}
