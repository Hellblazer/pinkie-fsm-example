/*
 * Copyright (c) 2013 Hal Hildebrand, all rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hellblazer.pinkie.buffer.fsmExample;

import com.hellblazer.pinkie.buffer.BufferProtocol;

/**
 * 
 * @author hhildebrand
 * 
 */
public interface SimpleProtocol {
    public enum MessageType {
        ESTABLISH, MSG, ACK, GOOD_BYE;
    }

    void setBufferProtocol(BufferProtocol bufferProtocol);
    
    void establishClientSession();
    
    void establishServerSession();
    
    void ackReceived();

	/**
	 * @param message
	 */
	void transmitMessage(String message);

	/**
	 * 
	 */
	void sendGoodbye();

	/**
	 * 
	 */
	void enableSend();

	/**
	 * 
	 */
	void awaitSession();

	/**
	 * 
	 */
	void processMessage();

	/**
	 * 
	 */
	void awaitMessage();


}
