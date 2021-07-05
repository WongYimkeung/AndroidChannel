package com.huangyq.channel;

import com.huangyq.channel.reader.CommentReader;
import com.huangyq.channel.reader.MetaInfoReader;
import com.huangyq.channel.writer.CommentWriter;

import java.io.File;

public class ChannelUtil {
    public static String readChannel(File file) {
        String channel = MetaInfoReader.readChannel(file);
        if (null == channel) {
            channel = CommentReader.readChannel(file);
        }
        return channel;
    }

    public static void writeChannel(File file, String channel) {
        // todo 根据需要选择
        //MetaInfoWriter.put(file, channel);
        CommentWriter.writeChannel(file, channel);
    }
}