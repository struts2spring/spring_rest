/**
 * 
 */
package com.example.util;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.domain.FileInformation;

/**
 * @author vijay
 * 
 */
public class FileInfoUtilTest {

	FileInfoUtil fileInfoUtil;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fileInfoUtil = new FileInfoUtil();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		fileInfoUtil = null;
	}

	/**
	 * Test method for
	 * {@link com.example.util.FileInfoUtil#getFileTreeInfo(java.lang.String)}.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testGetFileTreeInfo() {
		try {
			String current = new java.io.File(".").getCanonicalPath();
			List<?> lst = fileInfoUtil.getFileTreeInfo(current);
			int lstCount = lst.size();
			Assert.assertNotEquals(0, lstCount);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Test method for
	 * {@link com.example.util.FileInfoUtil#getFileInfo(java.lang.String)}.
	 */
	@Test
	public void testGetFileInfo() {
		try {
			String current = new java.io.File(".").getCanonicalPath();
			System.out.println(current);
			FileInformation fileInfo = fileInfoUtil.getFileInfo(current);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
