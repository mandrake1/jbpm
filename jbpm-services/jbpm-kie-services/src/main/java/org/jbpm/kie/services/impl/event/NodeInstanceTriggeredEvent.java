package org.jbpm.kie.services.impl.event;

import org.kie.api.event.process.ProcessNodeTriggeredEvent;

public class NodeInstanceTriggeredEvent extends NodeInstanceEvent {

    private static final long serialVersionUID = -770303975624590552L;

    public NodeInstanceTriggeredEvent(ProcessNodeTriggeredEvent event) {
        super(event);
    }

}
