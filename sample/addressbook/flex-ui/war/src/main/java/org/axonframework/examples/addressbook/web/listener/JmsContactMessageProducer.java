package org.axonframework.examples.addressbook.web.listener;

import org.axonframework.examples.addressbook.web.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.messaging.MessageTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Jettro Coenradie
 */
@Component
public class JmsContactMessageProducer {

    private MessageTemplate template;

    @Autowired
    public JmsContactMessageProducer(MessageTemplate template) {
        this.template = template;
    }

    public void sendContactUpdate(final ContactDTO contactDTO) {
        template.send(contactDTO);
    }
}
