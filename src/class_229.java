
// $FF: renamed from: fn
public class class_229 {

   // $FF: renamed from: f int
   final int field_2567;
   // $FF: renamed from: n fn
   static final class_229 field_2568;
   // $FF: renamed from: v fn
   static final class_229 field_2569;
   // $FF: renamed from: l int
   public static final int field_2570 = 4096;
   // $FF: renamed from: k int
   public static final int field_2571 = 2;
   // $FF: renamed from: z int
   public static final int field_2572 = 128;
   // $FF: renamed from: ek jp
   static class_307 field_2573;
   // $FF: renamed from: x int
   public static final int field_2574 = 8;


   // $FF: renamed from: <init> (int) void
   class_229(int var1) {
      super();
      try {
         this.field_2567 = 193399743 * var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_229 var10000 = new class_229(0);
      field_2569 = var10000;
      var10000 = new class_229(1);
      field_2568 = var10000;
   }

   // $FF: renamed from: n (jp, int, int) void
   static void method_4359(class_307 var0, int var1, int var2) {
      try {
         if(class_202.field_2369 != null) {
            if(var2 < -1093561710) {
               class_202.field_2369.offset = var1 * 384402024 + -833490559;
               int var3 = class_202.field_2369.readInt();
               int var4 = class_202.field_2369.readInt();
               var0.method_5489(var3, var4, -887756709);
            }
         } else {
            class_278.method_5146((class_307)null, 255, 255, 0, (byte)0, true, (byte)-57);
            class_314.field_3765[var1] = var0;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: n (jv, jv, boolean, int, int) void
   static void method_4360(class_306 var0, class_306 var1, boolean var2, int var3, int var4) {
      try {
         if(class_177.field_2206) {
            if(var4 != 597563067) {
               if(4 == var3) {
                  if(var4 == 597563067) {
                     return;
                  }

                  class_177.field_2194 = -274741812;
               }

            }
         } else {
            class_177.field_2194 = var3 * 2078798195;
            class_65.method_662();
            byte[] var5 = var0.method_5384("title.jpg", "");
            class_177.field_2186 = class_86.method_1480(var5);
            class_52.field_378 = class_177.field_2186.method_856();
            class_311.method_5553(var1, client.field_1414 * 1088533541, (byte)26);
            class_299.field_3369 = class_79.method_1257(var1, "titlebox", "");
            class_177.field_2185 = class_79.method_1257(var1, "titlebutton", "");
            int var7 = var1.method_5399("runes");
            int var8 = var1.method_5400(var7, "");
            class_66[] var6 = class_212.method_4182(var1, var7, var8);
            class_177.field_2184 = var6;
            var8 = var1.method_5399("title_mute");
            int var9 = var1.method_5400(var8, "");
            class_66[] var11 = class_212.method_4182(var1, var8, var9);
            class_148.field_1872 = var11;
            class_160.field_2001 = class_79.method_1257(var1, "options_radio_buttons,0", "");
            class_148.field_1876 = class_79.method_1257(var1, "options_radio_buttons,4", "");
            class_312.field_3759 = class_79.method_1257(var1, "options_radio_buttons,2", "");
            class_44.field_323 = class_79.method_1257(var1, "options_radio_buttons,6", "");
            class_43.field_311 = 1495272685 * class_160.field_2001.field_498;
            class_220.field_2491 = -1878338039 * class_160.field_2001.field_492;
            class_162 var10000 = new class_162(class_177.field_2184);
            class_176.field_2181 = var10000;
            if(var2) {
               class_177.field_2200 = "";
               class_177.field_2212 = "";
            }

            class_54.field_405 = 0;
            class_282.field_3249 = "";
            class_177.field_2203 = true;
            class_177.field_2202 = false;
            if(!class_87.preferences.musicEnabled) {
               if(var4 == 597563067) {
                  throw new IllegalStateException();
               }

               class_116.method_2246(2, class_194.field_2307, "scape main", "", 255, false);
            } else {
               class_215.method_4193(2);
            }

            class_295.method_5317(false, (byte)78);
            class_177.field_2206 = true;
            class_177.field_2183 = (646214551 * class_137.field_1766 - 765) / 2 * 1213207379;
            class_177.field_2189 = -1366237486 + 322976471 * class_177.field_2183;
            class_204.field_2391 = 1849138212 + class_177.field_2189 * -1802309191;
            class_177.field_2186.method_765(751544539 * class_177.field_2183, 0);
            class_52.field_378.method_765(class_177.field_2183 * 751544539 + 382, 0);
            class_372.field_4114.method_735(751544539 * class_177.field_2183 + 382 - class_372.field_4114.field_498 / 2, 18);
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: n (int, int, int, int, int, int, short) int
   public static int method_4361(int var0, int var1, int var2, int var3, int var4, int var5, short var6) {
      try {
         if((var5 & 1) == 1) {
            int var7 = var3;
            var3 = var4;
            var4 = var7;
         }

         var2 &= 3;
         if(var2 == 0) {
            if(var6 != 4030) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            return var2 == 1?7 - var0 - (var3 - 1):(2 == var2?7 - var1 - (var4 - 1):var0);
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }
}
