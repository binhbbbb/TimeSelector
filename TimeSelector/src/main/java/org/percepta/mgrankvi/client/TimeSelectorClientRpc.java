package org.percepta.mgrankvi.client;

import com.vaadin.shared.communication.ClientRpc;

// ClientRpc is used to pass events from server to client
// For sending information about the changes to component state, use State instead
public interface TimeSelectorClientRpc extends ClientRpc {

	// Example API: Fire up alert box in client
	void setTime(int hours, int minutes);

}