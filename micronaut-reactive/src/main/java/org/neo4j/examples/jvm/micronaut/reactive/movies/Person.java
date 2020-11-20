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
package org.neo4j.examples.jvm.micronaut.reactive.movies;

import io.micronaut.core.annotation.Introspected;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Michael J. Simons
 */
@Introspected
public final class Person {

	private final Long id;

	private final String name;

	private Integer born;

	Person(Long id, String name, Integer born) {
		this.id = id;
		this.born = born;
		this.name = name;
	}

	@JsonCreator
	public Person(@JsonProperty("name") String name, @JsonProperty("born") Integer born) {
		this(null, name, born);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getBorn() {
		return born;
	}

	public void setBorn(Integer born) {
		this.born = born;
	}
}
