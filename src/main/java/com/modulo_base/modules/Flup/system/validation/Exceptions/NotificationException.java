package com.modulo_base.modules.Flup.system.validation.Exceptions;

import com.modulo_base.modules.Flup.system.validation.handlers.Notification;

public class NotificationException extends DomainException {
    public NotificationException(final String aMessage, final Notification notification) {
        super(aMessage, notification.getErrors());
    }
}
