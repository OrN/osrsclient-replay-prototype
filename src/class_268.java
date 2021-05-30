
// $FF: renamed from: hv
public class class_268 implements class_12 {

   // $FF: renamed from: y hv
   public static final class_268 field_3158;
   // $FF: renamed from: n hv
   static final class_268 field_3159;
   // $FF: renamed from: b hv[]
   static final class_268[] field_3160;
   // $FF: renamed from: f hv
   public static final class_268 field_3161;
   // $FF: renamed from: p hv
   public static final class_268 field_3162;
   // $FF: renamed from: j hv
   static final class_268 field_3163;
   // $FF: renamed from: r int
   public final int field_3164;
   // $FF: renamed from: v hv
   public static final class_268 field_3165;
   // $FF: renamed from: a int
   static final int field_3166 = 17;
   // $FF: renamed from: ai int
   static final int field_3167 = 37;
   // $FF: renamed from: cy int
   public static final int field_3168 = 4;


   // $FF: renamed from: <init> (int, int) void
   class_268(int var1, int var2) {
      super();
      try {
         this.field_3164 = var1 * -1120447945;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "hv.<init>(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_268 var10000 = new class_268(14, 0);
      field_3165 = var10000;
      var10000 = new class_268(15, 4);
      field_3159 = var10000;
      var10000 = new class_268(16, -2);
      field_3161 = var10000;
      var10000 = new class_268(18, -2);
      field_3158 = var10000;
      var10000 = new class_268(19, -2);
      field_3162 = var10000;
      var10000 = new class_268(27, 0);
      field_3163 = var10000;
      field_3160 = new class_268[32];
      class_268[] var0 = new class_268[]{field_3163, field_3165, field_3162, field_3158, field_3159, field_3161};
      class_268[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         field_3160[var1[var2].field_3164 * -2104818809] = var1[var2];
      }

   }

   // $FF: renamed from: kh (int, int) void
   static final void method_5038(int var0, int var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 127);
         class_87.field_852.field_2115 = var0 * 1570911753;
         class_94.method_1771(-916329352);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "hv.kh(" + ')');
      }
   }
}
