// ORM class for table 'reconcilation_tbl'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 21 15:43:11 IST 2022
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class reconcilation_tbl extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer custid;
  public Integer get_custid() {
    return custid;
  }
  public void set_custid(Integer custid) {
    this.custid = custid;
  }
  public reconcilation_tbl with_custid(Integer custid) {
    this.custid = custid;
    return this;
  }
  private Integer dayc;
  public Integer get_dayc() {
    return dayc;
  }
  public void set_dayc(Integer dayc) {
    this.dayc = dayc;
  }
  public reconcilation_tbl with_dayc(Integer dayc) {
    this.dayc = dayc;
    return this;
  }
  private String http_info;
  public String get_http_info() {
    return http_info;
  }
  public void set_http_info(String http_info) {
    this.http_info = http_info;
  }
  public reconcilation_tbl with_http_info(String http_info) {
    this.http_info = http_info;
    return this;
  }
  private String http_type;
  public String get_http_type() {
    return http_type;
  }
  public void set_http_type(String http_type) {
    this.http_type = http_type;
  }
  public reconcilation_tbl with_http_type(String http_type) {
    this.http_type = http_type;
    return this;
  }
  private String ip;
  public String get_ip() {
    return ip;
  }
  public void set_ip(String ip) {
    this.ip = ip;
  }
  public reconcilation_tbl with_ip(String ip) {
    this.ip = ip;
    return this;
  }
  private String monthc;
  public String get_monthc() {
    return monthc;
  }
  public void set_monthc(String monthc) {
    this.monthc = monthc;
  }
  public reconcilation_tbl with_monthc(String monthc) {
    this.monthc = monthc;
    return this;
  }
  private String ms;
  public String get_ms() {
    return ms;
  }
  public void set_ms(String ms) {
    this.ms = ms;
  }
  public reconcilation_tbl with_ms(String ms) {
    this.ms = ms;
    return this;
  }
  private String prp_1;
  public String get_prp_1() {
    return prp_1;
  }
  public void set_prp_1(String prp_1) {
    this.prp_1 = prp_1;
  }
  public reconcilation_tbl with_prp_1(String prp_1) {
    this.prp_1 = prp_1;
    return this;
  }
  private String prp_2;
  public String get_prp_2() {
    return prp_2;
  }
  public void set_prp_2(String prp_2) {
    this.prp_2 = prp_2;
  }
  public reconcilation_tbl with_prp_2(String prp_2) {
    this.prp_2 = prp_2;
    return this;
  }
  private String prp_3;
  public String get_prp_3() {
    return prp_3;
  }
  public void set_prp_3(String prp_3) {
    this.prp_3 = prp_3;
  }
  public reconcilation_tbl with_prp_3(String prp_3) {
    this.prp_3 = prp_3;
    return this;
  }
  private String purchase_category;
  public String get_purchase_category() {
    return purchase_category;
  }
  public void set_purchase_category(String purchase_category) {
    this.purchase_category = purchase_category;
  }
  public reconcilation_tbl with_purchase_category(String purchase_category) {
    this.purchase_category = purchase_category;
    return this;
  }
  private String purchase_sub_category;
  public String get_purchase_sub_category() {
    return purchase_sub_category;
  }
  public void set_purchase_sub_category(String purchase_sub_category) {
    this.purchase_sub_category = purchase_sub_category;
  }
  public reconcilation_tbl with_purchase_sub_category(String purchase_sub_category) {
    this.purchase_sub_category = purchase_sub_category;
    return this;
  }
  private String quote_count;
  public String get_quote_count() {
    return quote_count;
  }
  public void set_quote_count(String quote_count) {
    this.quote_count = quote_count;
  }
  public reconcilation_tbl with_quote_count(String quote_count) {
    this.quote_count = quote_count;
    return this;
  }
  private Integer status_code;
  public Integer get_status_code() {
    return status_code;
  }
  public void set_status_code(Integer status_code) {
    this.status_code = status_code;
  }
  public reconcilation_tbl with_status_code(Integer status_code) {
    this.status_code = status_code;
    return this;
  }
  private String total_count;
  public String get_total_count() {
    return total_count;
  }
  public void set_total_count(String total_count) {
    this.total_count = total_count;
  }
  public reconcilation_tbl with_total_count(String total_count) {
    this.total_count = total_count;
    return this;
  }
  private String updated_time;
  public String get_updated_time() {
    return updated_time;
  }
  public void set_updated_time(String updated_time) {
    this.updated_time = updated_time;
  }
  public reconcilation_tbl with_updated_time(String updated_time) {
    this.updated_time = updated_time;
    return this;
  }
  private String username;
  public String get_username() {
    return username;
  }
  public void set_username(String username) {
    this.username = username;
  }
  public reconcilation_tbl with_username(String username) {
    this.username = username;
    return this;
  }
  private String yearc;
  public String get_yearc() {
    return yearc;
  }
  public void set_yearc(String yearc) {
    this.yearc = yearc;
  }
  public reconcilation_tbl with_yearc(String yearc) {
    this.yearc = yearc;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof reconcilation_tbl)) {
      return false;
    }
    reconcilation_tbl that = (reconcilation_tbl) o;
    boolean equal = true;
    equal = equal && (this.custid == null ? that.custid == null : this.custid.equals(that.custid));
    equal = equal && (this.dayc == null ? that.dayc == null : this.dayc.equals(that.dayc));
    equal = equal && (this.http_info == null ? that.http_info == null : this.http_info.equals(that.http_info));
    equal = equal && (this.http_type == null ? that.http_type == null : this.http_type.equals(that.http_type));
    equal = equal && (this.ip == null ? that.ip == null : this.ip.equals(that.ip));
    equal = equal && (this.monthc == null ? that.monthc == null : this.monthc.equals(that.monthc));
    equal = equal && (this.ms == null ? that.ms == null : this.ms.equals(that.ms));
    equal = equal && (this.prp_1 == null ? that.prp_1 == null : this.prp_1.equals(that.prp_1));
    equal = equal && (this.prp_2 == null ? that.prp_2 == null : this.prp_2.equals(that.prp_2));
    equal = equal && (this.prp_3 == null ? that.prp_3 == null : this.prp_3.equals(that.prp_3));
    equal = equal && (this.purchase_category == null ? that.purchase_category == null : this.purchase_category.equals(that.purchase_category));
    equal = equal && (this.purchase_sub_category == null ? that.purchase_sub_category == null : this.purchase_sub_category.equals(that.purchase_sub_category));
    equal = equal && (this.quote_count == null ? that.quote_count == null : this.quote_count.equals(that.quote_count));
    equal = equal && (this.status_code == null ? that.status_code == null : this.status_code.equals(that.status_code));
    equal = equal && (this.total_count == null ? that.total_count == null : this.total_count.equals(that.total_count));
    equal = equal && (this.updated_time == null ? that.updated_time == null : this.updated_time.equals(that.updated_time));
    equal = equal && (this.username == null ? that.username == null : this.username.equals(that.username));
    equal = equal && (this.yearc == null ? that.yearc == null : this.yearc.equals(that.yearc));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof reconcilation_tbl)) {
      return false;
    }
    reconcilation_tbl that = (reconcilation_tbl) o;
    boolean equal = true;
    equal = equal && (this.custid == null ? that.custid == null : this.custid.equals(that.custid));
    equal = equal && (this.dayc == null ? that.dayc == null : this.dayc.equals(that.dayc));
    equal = equal && (this.http_info == null ? that.http_info == null : this.http_info.equals(that.http_info));
    equal = equal && (this.http_type == null ? that.http_type == null : this.http_type.equals(that.http_type));
    equal = equal && (this.ip == null ? that.ip == null : this.ip.equals(that.ip));
    equal = equal && (this.monthc == null ? that.monthc == null : this.monthc.equals(that.monthc));
    equal = equal && (this.ms == null ? that.ms == null : this.ms.equals(that.ms));
    equal = equal && (this.prp_1 == null ? that.prp_1 == null : this.prp_1.equals(that.prp_1));
    equal = equal && (this.prp_2 == null ? that.prp_2 == null : this.prp_2.equals(that.prp_2));
    equal = equal && (this.prp_3 == null ? that.prp_3 == null : this.prp_3.equals(that.prp_3));
    equal = equal && (this.purchase_category == null ? that.purchase_category == null : this.purchase_category.equals(that.purchase_category));
    equal = equal && (this.purchase_sub_category == null ? that.purchase_sub_category == null : this.purchase_sub_category.equals(that.purchase_sub_category));
    equal = equal && (this.quote_count == null ? that.quote_count == null : this.quote_count.equals(that.quote_count));
    equal = equal && (this.status_code == null ? that.status_code == null : this.status_code.equals(that.status_code));
    equal = equal && (this.total_count == null ? that.total_count == null : this.total_count.equals(that.total_count));
    equal = equal && (this.updated_time == null ? that.updated_time == null : this.updated_time.equals(that.updated_time));
    equal = equal && (this.username == null ? that.username == null : this.username.equals(that.username));
    equal = equal && (this.yearc == null ? that.yearc == null : this.yearc.equals(that.yearc));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.custid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.dayc = JdbcWritableBridge.readInteger(2, __dbResults);
    this.http_info = JdbcWritableBridge.readString(3, __dbResults);
    this.http_type = JdbcWritableBridge.readString(4, __dbResults);
    this.ip = JdbcWritableBridge.readString(5, __dbResults);
    this.monthc = JdbcWritableBridge.readString(6, __dbResults);
    this.ms = JdbcWritableBridge.readString(7, __dbResults);
    this.prp_1 = JdbcWritableBridge.readString(8, __dbResults);
    this.prp_2 = JdbcWritableBridge.readString(9, __dbResults);
    this.prp_3 = JdbcWritableBridge.readString(10, __dbResults);
    this.purchase_category = JdbcWritableBridge.readString(11, __dbResults);
    this.purchase_sub_category = JdbcWritableBridge.readString(12, __dbResults);
    this.quote_count = JdbcWritableBridge.readString(13, __dbResults);
    this.status_code = JdbcWritableBridge.readInteger(14, __dbResults);
    this.total_count = JdbcWritableBridge.readString(15, __dbResults);
    this.updated_time = JdbcWritableBridge.readString(16, __dbResults);
    this.username = JdbcWritableBridge.readString(17, __dbResults);
    this.yearc = JdbcWritableBridge.readString(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.custid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.dayc = JdbcWritableBridge.readInteger(2, __dbResults);
    this.http_info = JdbcWritableBridge.readString(3, __dbResults);
    this.http_type = JdbcWritableBridge.readString(4, __dbResults);
    this.ip = JdbcWritableBridge.readString(5, __dbResults);
    this.monthc = JdbcWritableBridge.readString(6, __dbResults);
    this.ms = JdbcWritableBridge.readString(7, __dbResults);
    this.prp_1 = JdbcWritableBridge.readString(8, __dbResults);
    this.prp_2 = JdbcWritableBridge.readString(9, __dbResults);
    this.prp_3 = JdbcWritableBridge.readString(10, __dbResults);
    this.purchase_category = JdbcWritableBridge.readString(11, __dbResults);
    this.purchase_sub_category = JdbcWritableBridge.readString(12, __dbResults);
    this.quote_count = JdbcWritableBridge.readString(13, __dbResults);
    this.status_code = JdbcWritableBridge.readInteger(14, __dbResults);
    this.total_count = JdbcWritableBridge.readString(15, __dbResults);
    this.updated_time = JdbcWritableBridge.readString(16, __dbResults);
    this.username = JdbcWritableBridge.readString(17, __dbResults);
    this.yearc = JdbcWritableBridge.readString(18, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(custid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(dayc, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(http_info, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(http_type, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ip, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(monthc, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ms, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prp_1, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prp_2, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prp_3, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(purchase_category, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(purchase_sub_category, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(quote_count, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(status_code, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(total_count, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(updated_time, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(username, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(yearc, 18 + __off, 12, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(custid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(dayc, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(http_info, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(http_type, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ip, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(monthc, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ms, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prp_1, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prp_2, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prp_3, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(purchase_category, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(purchase_sub_category, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(quote_count, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(status_code, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(total_count, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(updated_time, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(username, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(yearc, 18 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.custid = null;
    } else {
    this.custid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.dayc = null;
    } else {
    this.dayc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.http_info = null;
    } else {
    this.http_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.http_type = null;
    } else {
    this.http_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ip = null;
    } else {
    this.ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.monthc = null;
    } else {
    this.monthc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ms = null;
    } else {
    this.ms = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.prp_1 = null;
    } else {
    this.prp_1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.prp_2 = null;
    } else {
    this.prp_2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.prp_3 = null;
    } else {
    this.prp_3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.purchase_category = null;
    } else {
    this.purchase_category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.purchase_sub_category = null;
    } else {
    this.purchase_sub_category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.quote_count = null;
    } else {
    this.quote_count = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status_code = null;
    } else {
    this.status_code = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.total_count = null;
    } else {
    this.total_count = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.updated_time = null;
    } else {
    this.updated_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.username = null;
    } else {
    this.username = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.yearc = null;
    } else {
    this.yearc = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.custid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.custid);
    }
    if (null == this.dayc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dayc);
    }
    if (null == this.http_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, http_info);
    }
    if (null == this.http_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, http_type);
    }
    if (null == this.ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ip);
    }
    if (null == this.monthc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, monthc);
    }
    if (null == this.ms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ms);
    }
    if (null == this.prp_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prp_1);
    }
    if (null == this.prp_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prp_2);
    }
    if (null == this.prp_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prp_3);
    }
    if (null == this.purchase_category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, purchase_category);
    }
    if (null == this.purchase_sub_category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, purchase_sub_category);
    }
    if (null == this.quote_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, quote_count);
    }
    if (null == this.status_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.status_code);
    }
    if (null == this.total_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, total_count);
    }
    if (null == this.updated_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, updated_time);
    }
    if (null == this.username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, username);
    }
    if (null == this.yearc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, yearc);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.custid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.custid);
    }
    if (null == this.dayc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dayc);
    }
    if (null == this.http_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, http_info);
    }
    if (null == this.http_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, http_type);
    }
    if (null == this.ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ip);
    }
    if (null == this.monthc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, monthc);
    }
    if (null == this.ms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ms);
    }
    if (null == this.prp_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prp_1);
    }
    if (null == this.prp_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prp_2);
    }
    if (null == this.prp_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prp_3);
    }
    if (null == this.purchase_category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, purchase_category);
    }
    if (null == this.purchase_sub_category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, purchase_sub_category);
    }
    if (null == this.quote_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, quote_count);
    }
    if (null == this.status_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.status_code);
    }
    if (null == this.total_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, total_count);
    }
    if (null == this.updated_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, updated_time);
    }
    if (null == this.username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, username);
    }
    if (null == this.yearc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, yearc);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(custid==null?"null":"" + custid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dayc==null?"null":"" + dayc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(http_info==null?"null":http_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(http_type==null?"null":http_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ip==null?"null":ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(monthc==null?"null":monthc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ms==null?"null":ms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prp_1==null?"null":prp_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prp_2==null?"null":prp_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prp_3==null?"null":prp_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(purchase_category==null?"null":purchase_category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(purchase_sub_category==null?"null":purchase_sub_category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quote_count==null?"null":quote_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status_code==null?"null":"" + status_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_count==null?"null":total_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_time==null?"null":updated_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(username==null?"null":username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(yearc==null?"null":yearc, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(custid==null?"null":"" + custid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dayc==null?"null":"" + dayc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(http_info==null?"null":http_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(http_type==null?"null":http_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ip==null?"null":ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(monthc==null?"null":monthc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ms==null?"null":ms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prp_1==null?"null":prp_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prp_2==null?"null":prp_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prp_3==null?"null":prp_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(purchase_category==null?"null":purchase_category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(purchase_sub_category==null?"null":purchase_sub_category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quote_count==null?"null":quote_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status_code==null?"null":"" + status_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_count==null?"null":total_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_time==null?"null":updated_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(username==null?"null":username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(yearc==null?"null":yearc, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.custid = null; } else {
      this.custid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dayc = null; } else {
      this.dayc = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.http_info = null; } else {
      this.http_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.http_type = null; } else {
      this.http_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ip = null; } else {
      this.ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.monthc = null; } else {
      this.monthc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ms = null; } else {
      this.ms = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.prp_1 = null; } else {
      this.prp_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.prp_2 = null; } else {
      this.prp_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.prp_3 = null; } else {
      this.prp_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.purchase_category = null; } else {
      this.purchase_category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.purchase_sub_category = null; } else {
      this.purchase_sub_category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.quote_count = null; } else {
      this.quote_count = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.status_code = null; } else {
      this.status_code = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.total_count = null; } else {
      this.total_count = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.updated_time = null; } else {
      this.updated_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.username = null; } else {
      this.username = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.yearc = null; } else {
      this.yearc = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.custid = null; } else {
      this.custid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dayc = null; } else {
      this.dayc = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.http_info = null; } else {
      this.http_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.http_type = null; } else {
      this.http_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ip = null; } else {
      this.ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.monthc = null; } else {
      this.monthc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ms = null; } else {
      this.ms = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.prp_1 = null; } else {
      this.prp_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.prp_2 = null; } else {
      this.prp_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.prp_3 = null; } else {
      this.prp_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.purchase_category = null; } else {
      this.purchase_category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.purchase_sub_category = null; } else {
      this.purchase_sub_category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.quote_count = null; } else {
      this.quote_count = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.status_code = null; } else {
      this.status_code = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.total_count = null; } else {
      this.total_count = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.updated_time = null; } else {
      this.updated_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.username = null; } else {
      this.username = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.yearc = null; } else {
      this.yearc = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    reconcilation_tbl o = (reconcilation_tbl) super.clone();
    return o;
  }

  public void clone0(reconcilation_tbl o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("custid", this.custid);
    __sqoop$field_map.put("dayc", this.dayc);
    __sqoop$field_map.put("http_info", this.http_info);
    __sqoop$field_map.put("http_type", this.http_type);
    __sqoop$field_map.put("ip", this.ip);
    __sqoop$field_map.put("monthc", this.monthc);
    __sqoop$field_map.put("ms", this.ms);
    __sqoop$field_map.put("prp_1", this.prp_1);
    __sqoop$field_map.put("prp_2", this.prp_2);
    __sqoop$field_map.put("prp_3", this.prp_3);
    __sqoop$field_map.put("purchase_category", this.purchase_category);
    __sqoop$field_map.put("purchase_sub_category", this.purchase_sub_category);
    __sqoop$field_map.put("quote_count", this.quote_count);
    __sqoop$field_map.put("status_code", this.status_code);
    __sqoop$field_map.put("total_count", this.total_count);
    __sqoop$field_map.put("updated_time", this.updated_time);
    __sqoop$field_map.put("username", this.username);
    __sqoop$field_map.put("yearc", this.yearc);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("custid", this.custid);
    __sqoop$field_map.put("dayc", this.dayc);
    __sqoop$field_map.put("http_info", this.http_info);
    __sqoop$field_map.put("http_type", this.http_type);
    __sqoop$field_map.put("ip", this.ip);
    __sqoop$field_map.put("monthc", this.monthc);
    __sqoop$field_map.put("ms", this.ms);
    __sqoop$field_map.put("prp_1", this.prp_1);
    __sqoop$field_map.put("prp_2", this.prp_2);
    __sqoop$field_map.put("prp_3", this.prp_3);
    __sqoop$field_map.put("purchase_category", this.purchase_category);
    __sqoop$field_map.put("purchase_sub_category", this.purchase_sub_category);
    __sqoop$field_map.put("quote_count", this.quote_count);
    __sqoop$field_map.put("status_code", this.status_code);
    __sqoop$field_map.put("total_count", this.total_count);
    __sqoop$field_map.put("updated_time", this.updated_time);
    __sqoop$field_map.put("username", this.username);
    __sqoop$field_map.put("yearc", this.yearc);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("custid".equals(__fieldName)) {
      this.custid = (Integer) __fieldVal;
    }
    else    if ("dayc".equals(__fieldName)) {
      this.dayc = (Integer) __fieldVal;
    }
    else    if ("http_info".equals(__fieldName)) {
      this.http_info = (String) __fieldVal;
    }
    else    if ("http_type".equals(__fieldName)) {
      this.http_type = (String) __fieldVal;
    }
    else    if ("ip".equals(__fieldName)) {
      this.ip = (String) __fieldVal;
    }
    else    if ("monthc".equals(__fieldName)) {
      this.monthc = (String) __fieldVal;
    }
    else    if ("ms".equals(__fieldName)) {
      this.ms = (String) __fieldVal;
    }
    else    if ("prp_1".equals(__fieldName)) {
      this.prp_1 = (String) __fieldVal;
    }
    else    if ("prp_2".equals(__fieldName)) {
      this.prp_2 = (String) __fieldVal;
    }
    else    if ("prp_3".equals(__fieldName)) {
      this.prp_3 = (String) __fieldVal;
    }
    else    if ("purchase_category".equals(__fieldName)) {
      this.purchase_category = (String) __fieldVal;
    }
    else    if ("purchase_sub_category".equals(__fieldName)) {
      this.purchase_sub_category = (String) __fieldVal;
    }
    else    if ("quote_count".equals(__fieldName)) {
      this.quote_count = (String) __fieldVal;
    }
    else    if ("status_code".equals(__fieldName)) {
      this.status_code = (Integer) __fieldVal;
    }
    else    if ("total_count".equals(__fieldName)) {
      this.total_count = (String) __fieldVal;
    }
    else    if ("updated_time".equals(__fieldName)) {
      this.updated_time = (String) __fieldVal;
    }
    else    if ("username".equals(__fieldName)) {
      this.username = (String) __fieldVal;
    }
    else    if ("yearc".equals(__fieldName)) {
      this.yearc = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("custid".equals(__fieldName)) {
      this.custid = (Integer) __fieldVal;
      return true;
    }
    else    if ("dayc".equals(__fieldName)) {
      this.dayc = (Integer) __fieldVal;
      return true;
    }
    else    if ("http_info".equals(__fieldName)) {
      this.http_info = (String) __fieldVal;
      return true;
    }
    else    if ("http_type".equals(__fieldName)) {
      this.http_type = (String) __fieldVal;
      return true;
    }
    else    if ("ip".equals(__fieldName)) {
      this.ip = (String) __fieldVal;
      return true;
    }
    else    if ("monthc".equals(__fieldName)) {
      this.monthc = (String) __fieldVal;
      return true;
    }
    else    if ("ms".equals(__fieldName)) {
      this.ms = (String) __fieldVal;
      return true;
    }
    else    if ("prp_1".equals(__fieldName)) {
      this.prp_1 = (String) __fieldVal;
      return true;
    }
    else    if ("prp_2".equals(__fieldName)) {
      this.prp_2 = (String) __fieldVal;
      return true;
    }
    else    if ("prp_3".equals(__fieldName)) {
      this.prp_3 = (String) __fieldVal;
      return true;
    }
    else    if ("purchase_category".equals(__fieldName)) {
      this.purchase_category = (String) __fieldVal;
      return true;
    }
    else    if ("purchase_sub_category".equals(__fieldName)) {
      this.purchase_sub_category = (String) __fieldVal;
      return true;
    }
    else    if ("quote_count".equals(__fieldName)) {
      this.quote_count = (String) __fieldVal;
      return true;
    }
    else    if ("status_code".equals(__fieldName)) {
      this.status_code = (Integer) __fieldVal;
      return true;
    }
    else    if ("total_count".equals(__fieldName)) {
      this.total_count = (String) __fieldVal;
      return true;
    }
    else    if ("updated_time".equals(__fieldName)) {
      this.updated_time = (String) __fieldVal;
      return true;
    }
    else    if ("username".equals(__fieldName)) {
      this.username = (String) __fieldVal;
      return true;
    }
    else    if ("yearc".equals(__fieldName)) {
      this.yearc = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
