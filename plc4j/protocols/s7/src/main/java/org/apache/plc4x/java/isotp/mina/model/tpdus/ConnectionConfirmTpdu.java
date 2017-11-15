/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/
package org.apache.plc4x.java.isotp.mina.model.tpdus;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.plc4x.java.isotp.mina.model.params.Parameter;
import org.apache.plc4x.java.isotp.mina.model.types.ProtocolClass;
import org.apache.plc4x.java.isotp.mina.model.types.TpduCode;

import java.util.List;

public class ConnectionConfirmTpdu extends ConnectionTpdu {

    public ConnectionConfirmTpdu(short destinationReference, short sourceReference, ProtocolClass protocolClass, List<Parameter> parameters, IoBuffer userData) {
        super(TpduCode.CONNECTION_CONFIRM, destinationReference, sourceReference, protocolClass, parameters, userData);
    }

}