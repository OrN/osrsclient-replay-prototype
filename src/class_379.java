import java.util.Iterator;

// $FF: renamed from: ni
class class_379 implements Iterator {

   // $FF: renamed from: g int
   public static final int field_4198 = 69;
   // $FF: renamed from: v int
   int field_4199;
   // $FF: renamed from: j int[]
   static int[] field_4200;
   // $FF: synthetic field
   final class_259 this$0;


   // $FF: renamed from: g () void
   public void method_6657() {
      throw new UnsupportedOperationException();
   }

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ni.remove(" + ')');
      }
   }

   public Object next() {
      try {
         int var1 = (this.field_4199 += -627108215) * 425017273 - 1;
         class_368 var2 = (class_368)this.this$0.field_2902.method_5002((long)var1);
         return var2 != null?var2:this.this$0.method_4962(var1, 1323866848);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ni.next(" + ')');
      }
   }

   // $FF: renamed from: s () java.lang.Object
   public Object method_6658() {
      int var1 = (this.field_4199 += 1903261163) * 807796941 - 1;
      class_368 var2 = (class_368)this.this$0.field_2902.method_5002((long)var1);
      return var2 != null?var2:this.this$0.method_4962(var1, 2130741371);
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_6659() {
      int var1 = (this.field_4199 += -1358191222) * -326178913 - 1;
      class_368 var2 = (class_368)this.this$0.field_2902.method_5002((long)var1);
      return var2 != null?var2:this.this$0.method_4962(var1, 1534751253);
   }

   // $FF: renamed from: c () boolean
   public boolean method_6660() {
      return this.field_4199 * 425017273 < this.this$0.method_4951(-1126578481);
   }

   // $FF: renamed from: e () void
   public void method_6661() {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: u () java.lang.Object
   public Object method_6662() {
      int var1 = (this.field_4199 += -627108215) * 425017273 - 1;
      class_368 var2 = (class_368)this.this$0.field_2902.method_5002((long)var1);
      return var2 != null?var2:this.this$0.method_4962(var1, 139026697);
   }

   // $FF: renamed from: l () boolean
   public boolean method_6663() {
      return this.field_4199 * 425017273 < this.this$0.method_4951(-945373256);
   }

   // $FF: renamed from: o () boolean
   public boolean method_6664() {
      return this.field_4199 * 425017273 < this.this$0.method_4951(-1463766493);
   }

   public boolean hasNext() {
      try {
         return this.field_4199 * 425017273 < this.this$0.method_4951(-1710884845);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ni.hasNext(" + ')');
      }
   }

   // $FF: renamed from: <init> (nu) void
   void method_6665(class_259 var1) {
      this.this$0 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.Object
   public Object method_6666() {
      int var1 = (this.field_4199 += -627108215) * -198485180 - 1;
      class_368 var2 = (class_368)this.this$0.field_2902.method_5002((long)var1);
      return var2 != null?var2:this.this$0.method_4962(var1, 1456140357);
   }

   // $FF: renamed from: a () void
   public void method_6667() {
      throw new UnsupportedOperationException();
   }
}
