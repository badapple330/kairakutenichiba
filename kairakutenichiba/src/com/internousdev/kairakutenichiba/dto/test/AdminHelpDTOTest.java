package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.AdminHelpDTO;


public class AdminHelpDTOTest {

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = null;

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName2() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName3() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = " ";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName4() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "　";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName5() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName6() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName7() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName8() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = null;

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName2() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName3() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = " ";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName4() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "　";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName5() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName6() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName7() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.AdminHelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName8() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}





    public void testGetUserMail1() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = null;

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail2() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail3() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = " ";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail4() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "　";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail5() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }



    public void testGetUserMail6() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail7() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail8() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }



    public void testSetUserMail1() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = null;

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }



    public void testSetUserMail2() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }


    public void testSetUserMail3() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = " ";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }

    @Test
    public void testSetUserMail4() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "　";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }

    public void testSetUserMail5() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }



    public void testSetUserMail6() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }


    public void testSetUserMail7() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }


    public void testSetUserMail8() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }



/*****************************************UserMailここまで**************************/


    public void testGetCategory1() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = null;

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory2() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory3() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = " ";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetCategory4() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "　";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory5() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    @Test
    public void testGetCategory6() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory7() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory8() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    @Test
    public void testSetCategory1() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = null;

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }



    public void testSetCategory2() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory3() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = " ";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory4() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "　";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }

    public void testSetCategory5() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    @Test
    public void testSetCategory6() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory7() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory8() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }



/*****************************************Categoryここまで**************************/


    public void testGetComment1() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = null;

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment2() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment3() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = " ";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment4() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "　";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment5() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    @Test
    public void testGetComment6() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment7() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment8() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    @Test
    public void testSetComment1() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = null;

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }



    public void testSetComment2() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }


    public void testSetComment3() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = " ";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }

    @Test
    public void testSetComment4() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "　";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }

    public void testSetComment5() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }



    public void testSetComment6() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }


    public void testSetComment7() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "abc123あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }


    public void testSetComment8() {
        AdminHelpDTO test = new AdminHelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }
}




/*****************************************commentここまで**************************/
