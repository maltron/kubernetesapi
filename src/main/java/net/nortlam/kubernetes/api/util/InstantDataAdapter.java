/*
 * 
 * Copyright 2014 Mauricio "Maltron" Leal <maltron@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package net.nortlam.kubernetes.api.util;

import java.time.Instant;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Parse content from a Date and transform into a java.time.Instant
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
public class InstantDataAdapter extends XmlAdapter<String, Instant> {

    @Override
    public Instant unmarshal(String value) throws Exception {
        return Instant.parse(value);
    }

    @Override
    public String marshal(Instant instant) throws Exception {
        return instant.toString();
    }
}
