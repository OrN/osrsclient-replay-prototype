
// $FF: renamed from: js
public class class_310 {

   // $FF: renamed from: y java.lang.String
   String field_3742;
   // $FF: renamed from: n long
   public final long field_3743;
   // $FF: renamed from: f ju
   public final class_312 field_3744;
   // $FF: renamed from: v int
   public final int field_3745;
   // $FF: renamed from: p java.lang.String
   String field_3746;


    // $FF: renamed from: v (byte) java.lang.String
   public String method_5537() {
      try {
         return this.field_3742;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: <init> (nd, byte, int) void
   class_310(Buffer var1, byte var2, int var3) {
      super();
      try {
         this.field_3742 = var1.method_139(-391631059);
         this.field_3746 = var1.method_139(-391631059);
         this.field_3745 = var1.readShort() * 976507365;
         this.field_3743 = var1.readLong() * -1523233194100030643L;
         int var4 = var1.readInt();
         int var5 = var1.readInt();
         class_312 var10001 = new class_312();
         this.field_3744 = var10001;
         this.field_3744.method_5560(2);
         this.field_3744.method_5572(var2, (byte)110);
         this.field_3744.field_3758 = 675729031 * var4;
         this.field_3744.field_3756 = 1613502191 * var5;
         this.field_3744.field_3753 = 0;
         this.field_3744.field_3757 = 0;
         this.field_3744.field_3754 = var3 * 515671321;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: n (int) java.lang.String
   public String method_5543() {
      try {
         return this.field_3746;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
