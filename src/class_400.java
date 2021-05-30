
// $FF: renamed from: oo
public class class_400 {

   // $FF: renamed from: n int
   public static final int field_4263 = 65536;
   // $FF: renamed from: u int[]
   static final int[] field_4264;
   // $FF: renamed from: s int[]
   static final int[] field_4265;
   // $FF: renamed from: y int
   public static final int field_4266 = 512;
   // $FF: renamed from: j int
   public static final int field_4267 = 1024;
   // $FF: renamed from: d int
   public static final int field_4268 = 1792;
   // $FF: renamed from: v int
   static final int field_4269 = 2048;
   // $FF: renamed from: f int
   public static final int field_4270 = 256;


   // $FF: renamed from: <clinit> () void
   static {
      field_4265 = new int[2048];
      field_4264 = new int[2048];
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field_4265[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         field_4264[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
      }

   }

   // $FF: renamed from: <init> () void
   class_400() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "oo.<init>(" + ')');
      }
   }
}
