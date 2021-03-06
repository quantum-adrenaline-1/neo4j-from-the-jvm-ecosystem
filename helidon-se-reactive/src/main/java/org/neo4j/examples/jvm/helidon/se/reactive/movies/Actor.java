/*
 * Copyright (c) 2002-2020 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
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
 */
package org.neo4j.examples.jvm.helidon.se.reactive.movies;

import io.helidon.common.Reflected;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Michael J. Simons
 */
@Reflected
public final class Actor {

	private final Long id;

	private final String name;

	private final List<String> roles;

	Actor(Long id, String name, final List<String> roles) {
		this.id = id;
		this.name = name;
		this.roles = new ArrayList<>(roles);
	}

	public Actor(String name, final List<String> roles) {
		this(-1L, name, roles);
	}

	public Actor withId(Long id) {
		return this.id == id ? this : new Actor(id, this.name, this.roles);
	}

	public String getName() {
		return name;
	}

	public List<String> getRoles() {
		return Collections.unmodifiableList(roles);
	}
}
