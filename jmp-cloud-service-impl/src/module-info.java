module bank.jmp.service.core {
    requires transitive bank.jmp.service.api;
    requires bank.jmp.dto;
    exports com.dan.bank.service.core;
}