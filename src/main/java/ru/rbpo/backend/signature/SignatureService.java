package ru.rbpo.backend.signature;

import org.springframework.stereotype.Service;
import ru.rbpo.backend.dto.Ticket;

import java.util.Map;

/**
 * Заглушка модуля ЭЦП.
 * Полная реализация (SHA256withRSA + RFC 8785 + keystore) добавляется в task3-digital-signature.
 * До этого тикеты лицензий несут пустую подпись-плейсхолдер.
 */
@Service
public class SignatureService {

    public String signTicket(Ticket ticket) {
        return "";
    }

    public String sign(Map<String, Object> payload) {
        return "";
    }

    public byte[] signBytes(byte[] data) {
        return new byte[0];
    }
}
