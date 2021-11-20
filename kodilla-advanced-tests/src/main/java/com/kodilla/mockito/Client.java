package com.kodilla.mockito;

import com.sun.nio.sctp.Notification;

public interface Client {
    void receive(Notification notification);
}
