package Development.Utilities.General;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class MD5Util {

	public static synchronized String getMD5Checksum(byte[] bytes) {
		try {
			MessageDigest complete = MessageDigest.getInstance("MD5");
			complete.update(bytes);
			bytes = complete.digest();

			String result = "";
			for (int i = 0; i < bytes.length; i++) {
				result = result + Integer.toString((bytes[i] & 0xFF) + 256, 16).substring(1);
			}
			return result;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static synchronized String getMD5ChecksumSTAX(List<String> lines) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String line : lines) {
			stringBuilder.append(line);
		}
		return getMD5Checksum(stringBuilder.toString());
	}

	public static synchronized String getMD5Checksum(String value) {
		return getMD5Checksum(value.replaceAll("\\s", "").getBytes());
	}

	public static synchronized String getMD5Checksum(Path filePath) {
		try {
			return getMD5Checksum(Files.readAllBytes(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void writeMD5ChecksumSTAX(Path filePath, String closeTag) {
		try {
			List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
			String md5 = getMD5ChecksumSTAX(lines);
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filePath.toString(), true));
			writer.write("\t<MD5>" + md5 + "</MD5>\n");
			writer.write(closeTag);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
