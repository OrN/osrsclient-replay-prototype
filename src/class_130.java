
// $FF: renamed from: aj
public class class_130 {

   // $FF: renamed from: f java.lang.String
   final String field_1698;
   // $FF: renamed from: v int
   final int field_1699;
   // $FF: renamed from: n int
   final int field_1700;


    // $FF: renamed from: v () java.lang.String
   String method_2866() {
      return Integer.toHexString(this.field_1699) + Integer.toHexString(this.field_1700) + this.field_1698;
   }

   // $FF: renamed from: n () int
   int method_2867() {
      return this.field_1700;
   }

   // $FF: renamed from: <init> (nd) void
   class_130(class_28 var1) {
      this(var1.method_130(), var1.method_130(), var1.method_139(-391631059));
   }

    // $FF: renamed from: <init> (int, int, java.lang.String) void
   class_130(int var1, int var2, String var3) {
      super();
      this.field_1699 = var1;
      this.field_1700 = var2;
      this.field_1698 = var3;
   }

}
