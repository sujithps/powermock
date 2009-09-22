/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package samples.singleton;

/**
 *Can be used to assert that partial mocking of static methods works.
 */
public class StaticExample {

	public static void voidMethod() {
		privateVoidMethod();
	}

	private static void privateVoidMethod() {
	}

	public static void voidFinalMethod() {
		privateVoidFinalMethod();
	}

	private static final void privateVoidFinalMethod() {
	}

	public static Object objectMethod() {
		return privateObjectMethod();
	}

	private static Object privateObjectMethod() {
		return new Object();
	}

	public static Object objectFinalMethod() {
		return privateObjectFinalMethod();
	}

	private static final Object privateObjectFinalMethod() {
		return new Object();
	}
}