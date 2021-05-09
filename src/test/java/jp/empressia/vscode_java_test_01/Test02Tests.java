package jp.empressia.vscode_java_test_01;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import jp.empressia.vscode_java_test_02.Test02;

/**
 * テスト。
 */
public class Test02Tests {

	/**
	 * テスト。
	 */
	@Test
	public void test() {
		Test02 target = new Test02();
		assertAll(
			() -> assertThat(target, is(notNullValue()))
		);
	}

}
