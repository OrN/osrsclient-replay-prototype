
// $FF: renamed from: nz
public class class_393 {

   // $FF: renamed from: y (java.lang.String[], short[], int, int) void
   public static void method_6777(String[] var0, short[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var6 == null || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class_40.method_477(var0, var1, var2, var5 - 1, -366378193);
         class_40.method_477(var0, var1, var5 + 1, var3, 410236682);
      }

   }

   // $FF: renamed from: r (java.lang.String[], int[]) void
   public static void method_6778(String[] var0, int[] var1) {
      Connection.method_4060(var0, var1, 0, var0.length - 1, (byte)127);
   }

   // $FF: renamed from: <init> () void
   class_393() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: j (java.lang.String[], int[]) void
   public static void method_6780(String[] var0, int[] var1) {
      Connection.method_4060(var0, var1, 0, var0.length - 1, (byte)104);
   }

   // $FF: renamed from: s (java.lang.String[], int[], int, int) void
   static void method_6781(String[] var0, int[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         Connection.method_4060(var0, var1, var2, var5 - 1, (byte)113);
         Connection.method_4060(var0, var1, 1 + var5, var3, (byte)125);
      }

   }

   // $FF: renamed from: b (java.lang.String[], int[]) void
   public static void method_6782(String[] var0, int[] var1) {
      Connection.method_4060(var0, var1, 0, var0.length - 1, (byte)114);
   }

   // $FF: renamed from: d (java.lang.String[], int[]) void
   public static void method_6783(String[] var0, int[] var1) {
      Connection.method_4060(var0, var1, 0, var0.length - 1, (byte)119);
   }

   // $FF: renamed from: p (java.lang.String[], short[], int, int) void
   public static void method_6784(String[] var0, short[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var6 == null || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class_40.method_477(var0, var1, var2, var5 - 1, 853300226);
         class_40.method_477(var0, var1, var5 + 1, var3, 470886369);
      }

   }

   // $FF: renamed from: ic (int) void
   static final void method_6785(int var0) {
      try {
         boolean var1 = false;

         while(!var1) {
            if(var0 <= 18537530) {
               throw new IllegalStateException();
            }

            var1 = true;

            for(int var2 = 0; var2 < 673512273 * client.field_1554 - 1; ++var2) {
               if(client.field_1557[var2] < 1000) {
                  if(var0 <= 18537530) {
                     throw new IllegalStateException();
                  }

                  if(client.field_1557[1 + var2] > 1000) {
                     if(var0 <= 18537530) {
                        throw new IllegalStateException();
                     }

                     String var3 = client.field_1560[var2];
                     client.field_1560[var2] = client.field_1560[var2 + 1];
                     client.field_1560[var2 + 1] = var3;
                     String var4 = client.field_1631[var2];
                     client.field_1631[var2] = client.field_1631[var2 + 1];
                     client.field_1631[1 + var2] = var4;
                     int var5 = client.field_1557[var2];
                     client.field_1557[var2] = client.field_1557[1 + var2];
                     client.field_1557[var2 + 1] = var5;
                     var5 = client.field_1555[var2];
                     client.field_1555[var2] = client.field_1555[1 + var2];
                     client.field_1555[1 + var2] = var5;
                     var5 = client.field_1610[var2];
                     client.field_1610[var2] = client.field_1610[1 + var2];
                     client.field_1610[1 + var2] = var5;
                     var5 = client.field_1558[var2];
                     client.field_1558[var2] = client.field_1558[1 + var2];
                     client.field_1558[var2 + 1] = var5;
                     boolean var6 = client.field_1492[var2];
                     client.field_1492[var2] = client.field_1492[var2 + 1];
                     client.field_1492[var2 + 1] = var6;
                     var1 = false;
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}
