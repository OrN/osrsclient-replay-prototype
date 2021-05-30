
// $FF: renamed from: ja
public class class_292 implements class_14 {

   // $FF: renamed from: j ja
   static final class_292 field_3322;
   // $FF: renamed from: n ja
   static final class_292 field_3323;
   // $FF: renamed from: f ja
   static final class_292 field_3324;
   // $FF: renamed from: y ja
   static final class_292 field_3325;
   // $FF: renamed from: v ja
   static final class_292 field_3326;
   // $FF: renamed from: p ja
   static final class_292 field_3327;
   // $FF: renamed from: r ja
   static final class_292 field_3328;
   // $FF: renamed from: b int
   final int field_3329;
   // $FF: renamed from: d int
   public final int field_3330;
   // $FF: renamed from: s boolean
   public final boolean field_3331;
   // $FF: renamed from: u boolean
   public final boolean field_3332;
   // $FF: renamed from: k java.lang.String[]
   public static String[] field_3333;


   // $FF: renamed from: jw (int, int, int, boolean, byte) void
   static final void method_5297(int var0, int var1, int var2, boolean var3, byte var4) {
      try {
         if(!class_191.method_3957(var0, (byte)-20)) {
            if(var4 == 1) {
               throw new IllegalStateException();
            }
         } else {
            class_125.method_2286(class_37.field_93[var0], -1, var1, var2, var3, 2063222533);
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: <init> (int, int, boolean, boolean, boolean) void
   class_292(int var1, int var2, boolean var4, boolean var5) {
      super();
      try {
         this.field_3329 = 23546595 * var1;
         this.field_3330 = -212460899 * var2;
         this.field_3331 = var4;
         this.field_3332 = var5;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_292 var10000 = new class_292(0, -1, false, true);
      field_3326 = var10000;
      var10000 = new class_292(1, 0, true, true);
      field_3323 = var10000;
      var10000 = new class_292(2, 1, true, false);
      field_3324 = var10000;
      var10000 = new class_292(3, 2, false, true);
      field_3325 = var10000;
      var10000 = new class_292(4, 3, false, true);
      field_3327 = var10000;
      var10000 = new class_292(5, 10, false, true);
      field_3322 = var10000;
      var10000 = new class_292(6, 22, false, true);
      field_3328 = var10000;
   }

   // $FF: renamed from: p () ja[]
   public static class_292[] method_5300() {
      return new class_292[]{field_3328, field_3323, field_3322, field_3324, field_3325, field_3327, field_3326};
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return this.field_3329 * -614053173;
   }

   // $FF: renamed from: v (int) int
   public int method_50() {
      try {
         return this.field_3329 * -614053173;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: j () ja[]
   public static class_292[] method_5301() {
      return new class_292[]{field_3328, field_3323, field_3322, field_3324, field_3325, field_3327, field_3326};
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return this.field_3329 * -614053173;
   }
}
