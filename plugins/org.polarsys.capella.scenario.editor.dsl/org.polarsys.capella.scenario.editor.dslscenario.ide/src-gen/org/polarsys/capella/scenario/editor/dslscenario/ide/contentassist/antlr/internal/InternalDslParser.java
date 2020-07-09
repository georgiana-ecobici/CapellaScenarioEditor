package org.polarsys.capella.scenario.editor.dslscenario.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.polarsys.capella.scenario.editor.dslscenario.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IS'", "'ES'", "'System'", "'Logical'", "'Physical'", "'unset'", "'behavior'", "'node'", "'scenario'", "'}'", "'{'", "'FS'", "'EPBS'", "'OAS'", "'OES'", "'actor'", "'as'", "'component'", "'configuration_item'", "'function'", "'activity'", "'entity'", "'role'", "'->'", "':'", "'->+'", "'->x'", "'<--'", "'->>'", "'deactivate'", "'ref'", "'over'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenarioTypeAndParticipants"
    // InternalDsl.g:78:1: entryRuleScenarioTypeAndParticipants : ruleScenarioTypeAndParticipants EOF ;
    public final void entryRuleScenarioTypeAndParticipants() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleScenarioTypeAndParticipants EOF )
            // InternalDsl.g:80:1: ruleScenarioTypeAndParticipants EOF
            {
             before(grammarAccess.getScenarioTypeAndParticipantsRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioTypeAndParticipants();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenarioTypeAndParticipants"


    // $ANTLR start "ruleScenarioTypeAndParticipants"
    // InternalDsl.g:87:1: ruleScenarioTypeAndParticipants : ( ( rule__ScenarioTypeAndParticipants__Alternatives ) ) ;
    public final void ruleScenarioTypeAndParticipants() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__ScenarioTypeAndParticipants__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__ScenarioTypeAndParticipants__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__ScenarioTypeAndParticipants__Alternatives )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__ScenarioTypeAndParticipants__Alternatives )
            // InternalDsl.g:94:4: rule__ScenarioTypeAndParticipants__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenarioTypeAndParticipants"


    // $ANTLR start "entryRuleActor"
    // InternalDsl.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleActor EOF )
            // InternalDsl.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalDsl.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Actor__Group__0 )
            // InternalDsl.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:128:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleComponent EOF )
            // InternalDsl.g:130:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:137:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Component__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Component__Group__0 )
            // InternalDsl.g:144:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePhysicalComponent"
    // InternalDsl.g:153:1: entryRulePhysicalComponent : rulePhysicalComponent EOF ;
    public final void entryRulePhysicalComponent() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( rulePhysicalComponent EOF )
            // InternalDsl.g:155:1: rulePhysicalComponent EOF
            {
             before(grammarAccess.getPhysicalComponentRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicalComponent();

            state._fsp--;

             after(grammarAccess.getPhysicalComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhysicalComponent"


    // $ANTLR start "rulePhysicalComponent"
    // InternalDsl.g:162:1: rulePhysicalComponent : ( ( rule__PhysicalComponent__Group__0 ) ) ;
    public final void rulePhysicalComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__PhysicalComponent__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__PhysicalComponent__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__PhysicalComponent__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__PhysicalComponent__Group__0 )
            {
             before(grammarAccess.getPhysicalComponentAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__PhysicalComponent__Group__0 )
            // InternalDsl.g:169:4: rule__PhysicalComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhysicalComponent"


    // $ANTLR start "entryRuleConfigurationItem"
    // InternalDsl.g:178:1: entryRuleConfigurationItem : ruleConfigurationItem EOF ;
    public final void entryRuleConfigurationItem() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleConfigurationItem EOF )
            // InternalDsl.g:180:1: ruleConfigurationItem EOF
            {
             before(grammarAccess.getConfigurationItemRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationItem();

            state._fsp--;

             after(grammarAccess.getConfigurationItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationItem"


    // $ANTLR start "ruleConfigurationItem"
    // InternalDsl.g:187:1: ruleConfigurationItem : ( ( rule__ConfigurationItem__Group__0 ) ) ;
    public final void ruleConfigurationItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__ConfigurationItem__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__ConfigurationItem__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__ConfigurationItem__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__ConfigurationItem__Group__0 )
            {
             before(grammarAccess.getConfigurationItemAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__ConfigurationItem__Group__0 )
            // InternalDsl.g:194:4: rule__ConfigurationItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationItem"


    // $ANTLR start "entryRuleFunction"
    // InternalDsl.g:203:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleFunction EOF )
            // InternalDsl.g:205:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalDsl.g:212:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Function__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Function__Group__0 )
            // InternalDsl.g:219:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleActivity"
    // InternalDsl.g:228:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleActivity EOF )
            // InternalDsl.g:230:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:237:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Activity__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Activity__Group__0 )
            // InternalDsl.g:244:4: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:253:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleEntity EOF )
            // InternalDsl.g:255:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:262:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Entity__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Entity__Group__0 )
            // InternalDsl.g:269:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:278:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleRole EOF )
            // InternalDsl.g:280:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:287:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Role__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Role__Group__0 )
            // InternalDsl.g:294:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMessage"
    // InternalDsl.g:303:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleMessage EOF )
            // InternalDsl.g:305:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalDsl.g:312:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalDsl.g:317:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Message__Alternatives ) )
            // InternalDsl.g:318:3: ( rule__Message__Alternatives )
            {
             before(grammarAccess.getMessageAccess().getAlternatives()); 
            // InternalDsl.g:319:3: ( rule__Message__Alternatives )
            // InternalDsl.g:319:4: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Message__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleSequenceMessageType"
    // InternalDsl.g:328:1: entryRuleSequenceMessageType : ruleSequenceMessageType EOF ;
    public final void entryRuleSequenceMessageType() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleSequenceMessageType EOF )
            // InternalDsl.g:330:1: ruleSequenceMessageType EOF
            {
             before(grammarAccess.getSequenceMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceMessageType();

            state._fsp--;

             after(grammarAccess.getSequenceMessageTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceMessageType"


    // $ANTLR start "ruleSequenceMessageType"
    // InternalDsl.g:337:1: ruleSequenceMessageType : ( ( rule__SequenceMessageType__Group__0 ) ) ;
    public final void ruleSequenceMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__SequenceMessageType__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__SequenceMessageType__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__SequenceMessageType__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__SequenceMessageType__Group__0 )
            {
             before(grammarAccess.getSequenceMessageTypeAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__SequenceMessageType__Group__0 )
            // InternalDsl.g:344:4: rule__SequenceMessageType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessageType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceMessageType"


    // $ANTLR start "entryRuleSequenceMessage"
    // InternalDsl.g:353:1: entryRuleSequenceMessage : ruleSequenceMessage EOF ;
    public final void entryRuleSequenceMessage() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleSequenceMessage EOF )
            // InternalDsl.g:355:1: ruleSequenceMessage EOF
            {
             before(grammarAccess.getSequenceMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceMessage();

            state._fsp--;

             after(grammarAccess.getSequenceMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceMessage"


    // $ANTLR start "ruleSequenceMessage"
    // InternalDsl.g:362:1: ruleSequenceMessage : ( ( rule__SequenceMessage__Group__0 ) ) ;
    public final void ruleSequenceMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__SequenceMessage__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__SequenceMessage__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__SequenceMessage__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__SequenceMessage__Group__0 )
            {
             before(grammarAccess.getSequenceMessageAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__SequenceMessage__Group__0 )
            // InternalDsl.g:369:4: rule__SequenceMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceMessage"


    // $ANTLR start "entryRuleCreateMessage"
    // InternalDsl.g:378:1: entryRuleCreateMessage : ruleCreateMessage EOF ;
    public final void entryRuleCreateMessage() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleCreateMessage EOF )
            // InternalDsl.g:380:1: ruleCreateMessage EOF
            {
             before(grammarAccess.getCreateMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateMessage();

            state._fsp--;

             after(grammarAccess.getCreateMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateMessage"


    // $ANTLR start "ruleCreateMessage"
    // InternalDsl.g:387:1: ruleCreateMessage : ( ( rule__CreateMessage__Group__0 ) ) ;
    public final void ruleCreateMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__CreateMessage__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__CreateMessage__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__CreateMessage__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__CreateMessage__Group__0 )
            {
             before(grammarAccess.getCreateMessageAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__CreateMessage__Group__0 )
            // InternalDsl.g:394:4: rule__CreateMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateMessage"


    // $ANTLR start "entryRuleDeleteMessage"
    // InternalDsl.g:403:1: entryRuleDeleteMessage : ruleDeleteMessage EOF ;
    public final void entryRuleDeleteMessage() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleDeleteMessage EOF )
            // InternalDsl.g:405:1: ruleDeleteMessage EOF
            {
             before(grammarAccess.getDeleteMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteMessage();

            state._fsp--;

             after(grammarAccess.getDeleteMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeleteMessage"


    // $ANTLR start "ruleDeleteMessage"
    // InternalDsl.g:412:1: ruleDeleteMessage : ( ( rule__DeleteMessage__Group__0 ) ) ;
    public final void ruleDeleteMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__DeleteMessage__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__DeleteMessage__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__DeleteMessage__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__DeleteMessage__Group__0 )
            {
             before(grammarAccess.getDeleteMessageAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__DeleteMessage__Group__0 )
            // InternalDsl.g:419:4: rule__DeleteMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteMessage"


    // $ANTLR start "entryRuleReturnMessage"
    // InternalDsl.g:428:1: entryRuleReturnMessage : ruleReturnMessage EOF ;
    public final void entryRuleReturnMessage() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleReturnMessage EOF )
            // InternalDsl.g:430:1: ruleReturnMessage EOF
            {
             before(grammarAccess.getReturnMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnMessage();

            state._fsp--;

             after(grammarAccess.getReturnMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnMessage"


    // $ANTLR start "ruleReturnMessage"
    // InternalDsl.g:437:1: ruleReturnMessage : ( ( rule__ReturnMessage__Group__0 ) ) ;
    public final void ruleReturnMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__ReturnMessage__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__ReturnMessage__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__ReturnMessage__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__ReturnMessage__Group__0 )
            {
             before(grammarAccess.getReturnMessageAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__ReturnMessage__Group__0 )
            // InternalDsl.g:444:4: rule__ReturnMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnMessage"


    // $ANTLR start "entryRuleArmTimerMessage"
    // InternalDsl.g:453:1: entryRuleArmTimerMessage : ruleArmTimerMessage EOF ;
    public final void entryRuleArmTimerMessage() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleArmTimerMessage EOF )
            // InternalDsl.g:455:1: ruleArmTimerMessage EOF
            {
             before(grammarAccess.getArmTimerMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleArmTimerMessage();

            state._fsp--;

             after(grammarAccess.getArmTimerMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArmTimerMessage"


    // $ANTLR start "ruleArmTimerMessage"
    // InternalDsl.g:462:1: ruleArmTimerMessage : ( ( rule__ArmTimerMessage__Group__0 ) ) ;
    public final void ruleArmTimerMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__ArmTimerMessage__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__ArmTimerMessage__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__ArmTimerMessage__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__ArmTimerMessage__Group__0 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__ArmTimerMessage__Group__0 )
            // InternalDsl.g:469:4: rule__ArmTimerMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArmTimerMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArmTimerMessage"


    // $ANTLR start "entryRuleParticipantDeactivation"
    // InternalDsl.g:478:1: entryRuleParticipantDeactivation : ruleParticipantDeactivation EOF ;
    public final void entryRuleParticipantDeactivation() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleParticipantDeactivation EOF )
            // InternalDsl.g:480:1: ruleParticipantDeactivation EOF
            {
             before(grammarAccess.getParticipantDeactivationRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipantDeactivation();

            state._fsp--;

             after(grammarAccess.getParticipantDeactivationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantDeactivation"


    // $ANTLR start "ruleParticipantDeactivation"
    // InternalDsl.g:487:1: ruleParticipantDeactivation : ( ( rule__ParticipantDeactivation__Group__0 ) ) ;
    public final void ruleParticipantDeactivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__ParticipantDeactivation__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__ParticipantDeactivation__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__ParticipantDeactivation__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__ParticipantDeactivation__Group__0 )
            {
             before(grammarAccess.getParticipantDeactivationAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__ParticipantDeactivation__Group__0 )
            // InternalDsl.g:494:4: rule__ParticipantDeactivation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDeactivationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantDeactivation"


    // $ANTLR start "entryRuleReference"
    // InternalDsl.g:503:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleReference EOF )
            // InternalDsl.g:505:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDsl.g:512:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Reference__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Reference__Group__0 )
            // InternalDsl.g:519:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__Model__MessagesOrReferencesAlternatives_2_0"
    // InternalDsl.g:527:1: rule__Model__MessagesOrReferencesAlternatives_2_0 : ( ( ruleMessage ) | ( ruleReference ) );
    public final void rule__Model__MessagesOrReferencesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:531:1: ( ( ruleMessage ) | ( ruleReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||(LA1_0>=39 && LA1_0<=40)) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:532:2: ( ruleMessage )
                    {
                    // InternalDsl.g:532:2: ( ruleMessage )
                    // InternalDsl.g:533:3: ruleMessage
                    {
                     before(grammarAccess.getModelAccess().getMessagesOrReferencesMessageParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMessagesOrReferencesMessageParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:538:2: ( ruleReference )
                    {
                    // InternalDsl.g:538:2: ( ruleReference )
                    // InternalDsl.g:539:3: ruleReference
                    {
                     before(grammarAccess.getModelAccess().getMessagesOrReferencesReferenceParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMessagesOrReferencesReferenceParserRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MessagesOrReferencesAlternatives_2_0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives"
    // InternalDsl.g:548:1: rule__ScenarioTypeAndParticipants__Alternatives : ( ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:552:1: ( ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:553:2: ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) )
                    {
                    // InternalDsl.g:553:2: ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) )
                    // InternalDsl.g:554:3: ( rule__ScenarioTypeAndParticipants__Group_0__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_0()); 
                    // InternalDsl.g:555:3: ( rule__ScenarioTypeAndParticipants__Group_0__0 )
                    // InternalDsl.g:555:4: rule__ScenarioTypeAndParticipants__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:559:2: ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) )
                    {
                    // InternalDsl.g:559:2: ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) )
                    // InternalDsl.g:560:3: ( rule__ScenarioTypeAndParticipants__Group_1__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_1()); 
                    // InternalDsl.g:561:3: ( rule__ScenarioTypeAndParticipants__Group_1__0 )
                    // InternalDsl.g:561:4: rule__ScenarioTypeAndParticipants__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:565:2: ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) )
                    {
                    // InternalDsl.g:565:2: ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) )
                    // InternalDsl.g:566:3: ( rule__ScenarioTypeAndParticipants__Group_2__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_2()); 
                    // InternalDsl.g:567:3: ( rule__ScenarioTypeAndParticipants__Group_2__0 )
                    // InternalDsl.g:567:4: rule__ScenarioTypeAndParticipants__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:571:2: ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) )
                    {
                    // InternalDsl.g:571:2: ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) )
                    // InternalDsl.g:572:3: ( rule__ScenarioTypeAndParticipants__Group_3__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_3()); 
                    // InternalDsl.g:573:3: ( rule__ScenarioTypeAndParticipants__Group_3__0 )
                    // InternalDsl.g:573:4: rule__ScenarioTypeAndParticipants__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:577:2: ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) )
                    {
                    // InternalDsl.g:577:2: ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) )
                    // InternalDsl.g:578:3: ( rule__ScenarioTypeAndParticipants__Group_4__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_4()); 
                    // InternalDsl.g:579:3: ( rule__ScenarioTypeAndParticipants__Group_4__0 )
                    // InternalDsl.g:579:4: rule__ScenarioTypeAndParticipants__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:583:2: ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) )
                    {
                    // InternalDsl.g:583:2: ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) )
                    // InternalDsl.g:584:3: ( rule__ScenarioTypeAndParticipants__Group_5__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_5()); 
                    // InternalDsl.g:585:3: ( rule__ScenarioTypeAndParticipants__Group_5__0 )
                    // InternalDsl.g:585:4: rule__ScenarioTypeAndParticipants__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:589:2: ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) )
                    {
                    // InternalDsl.g:589:2: ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) )
                    // InternalDsl.g:590:3: ( rule__ScenarioTypeAndParticipants__Group_6__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_6()); 
                    // InternalDsl.g:591:3: ( rule__ScenarioTypeAndParticipants__Group_6__0 )
                    // InternalDsl.g:591:4: rule__ScenarioTypeAndParticipants__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_0_1"
    // InternalDsl.g:599:1: rule__ScenarioTypeAndParticipants__Alternatives_0_1 : ( ( 'IS' ) | ( 'ES' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:603:1: ( ( 'IS' ) | ( 'ES' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:604:2: ( 'IS' )
                    {
                    // InternalDsl.g:604:2: ( 'IS' )
                    // InternalDsl.g:605:3: 'IS'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_0_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:610:2: ( 'ES' )
                    {
                    // InternalDsl.g:610:2: ( 'ES' )
                    // InternalDsl.g:611:3: 'ES'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_0_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_0_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_1_1"
    // InternalDsl.g:620:1: rule__ScenarioTypeAndParticipants__Alternatives_1_1 : ( ( 'IS' ) | ( 'ES' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:624:1: ( ( 'IS' ) | ( 'ES' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:625:2: ( 'IS' )
                    {
                    // InternalDsl.g:625:2: ( 'IS' )
                    // InternalDsl.g:626:3: 'IS'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:631:2: ( 'ES' )
                    {
                    // InternalDsl.g:631:2: ( 'ES' )
                    // InternalDsl.g:632:3: 'ES'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_1_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_1_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0"
    // InternalDsl.g:641:1: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0 : ( ( ruleActor ) | ( ruleComponent ) );
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:645:1: ( ( ruleActor ) | ( ruleComponent ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:646:2: ( ruleActor )
                    {
                    // InternalDsl.g:646:2: ( ruleActor )
                    // InternalDsl.g:647:3: ruleActor
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_1_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_1_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:652:2: ( ruleComponent )
                    {
                    // InternalDsl.g:652:2: ( ruleComponent )
                    // InternalDsl.g:653:3: ruleComponent
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsComponentParserRuleCall_1_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsComponentParserRuleCall_1_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_2_1"
    // InternalDsl.g:662:1: rule__ScenarioTypeAndParticipants__Alternatives_2_1 : ( ( 'IS' ) | ( 'ES' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:1: ( ( 'IS' ) | ( 'ES' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:667:2: ( 'IS' )
                    {
                    // InternalDsl.g:667:2: ( 'IS' )
                    // InternalDsl.g:668:3: 'IS'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_2_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:673:2: ( 'ES' )
                    {
                    // InternalDsl.g:673:2: ( 'ES' )
                    // InternalDsl.g:674:3: 'ES'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_2_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_2_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0"
    // InternalDsl.g:683:1: rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0 : ( ( ruleActor ) | ( rulePhysicalComponent ) );
    public final void rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:687:1: ( ( ruleActor ) | ( rulePhysicalComponent ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:688:2: ( ruleActor )
                    {
                    // InternalDsl.g:688:2: ( ruleActor )
                    // InternalDsl.g:689:3: ruleActor
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantActorParserRuleCall_2_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantActorParserRuleCall_2_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:694:2: ( rulePhysicalComponent )
                    {
                    // InternalDsl.g:694:2: ( rulePhysicalComponent )
                    // InternalDsl.g:695:3: rulePhysicalComponent
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantPhysicalComponentParserRuleCall_2_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePhysicalComponent();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantPhysicalComponentParserRuleCall_2_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_3_0"
    // InternalDsl.g:704:1: rule__ScenarioTypeAndParticipants__Alternatives_3_0 : ( ( 'System' ) | ( 'Logical' ) | ( 'Physical' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:708:1: ( ( 'System' ) | ( 'Logical' ) | ( 'Physical' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:709:2: ( 'System' )
                    {
                    // InternalDsl.g:709:2: ( 'System' )
                    // InternalDsl.g:710:3: 'System'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:715:2: ( 'Logical' )
                    {
                    // InternalDsl.g:715:2: ( 'Logical' )
                    // InternalDsl.g:716:3: 'Logical'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:721:2: ( 'Physical' )
                    {
                    // InternalDsl.g:721:2: ( 'Physical' )
                    // InternalDsl.g:722:3: 'Physical'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_3_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_3_0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0"
    // InternalDsl.g:731:1: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0 : ( ( ruleEntity ) | ( ruleActor ) | ( ruleRole ) );
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:735:1: ( ( ruleEntity ) | ( ruleActor ) | ( ruleRole ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:736:2: ( ruleEntity )
                    {
                    // InternalDsl.g:736:2: ( ruleEntity )
                    // InternalDsl.g:737:3: ruleEntity
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsEntityParserRuleCall_6_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsEntityParserRuleCall_6_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:742:2: ( ruleActor )
                    {
                    // InternalDsl.g:742:2: ( ruleActor )
                    // InternalDsl.g:743:3: ruleActor
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_6_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_6_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:748:2: ( ruleRole )
                    {
                    // InternalDsl.g:748:2: ( ruleRole )
                    // InternalDsl.g:749:3: ruleRole
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsRoleParserRuleCall_6_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsRoleParserRuleCall_6_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0"


    // $ANTLR start "rule__PhysicalComponent__Alternatives_1"
    // InternalDsl.g:758:1: rule__PhysicalComponent__Alternatives_1 : ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) );
    public final void rule__PhysicalComponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:762:1: ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDsl.g:763:2: ( 'unset' )
                    {
                    // InternalDsl.g:763:2: ( 'unset' )
                    // InternalDsl.g:764:3: 'unset'
                    {
                     before(grammarAccess.getPhysicalComponentAccess().getUnsetKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPhysicalComponentAccess().getUnsetKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:769:2: ( 'behavior' )
                    {
                    // InternalDsl.g:769:2: ( 'behavior' )
                    // InternalDsl.g:770:3: 'behavior'
                    {
                     before(grammarAccess.getPhysicalComponentAccess().getBehaviorKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPhysicalComponentAccess().getBehaviorKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:775:2: ( 'node' )
                    {
                    // InternalDsl.g:775:2: ( 'node' )
                    // InternalDsl.g:776:3: 'node'
                    {
                     before(grammarAccess.getPhysicalComponentAccess().getNodeKeyword_1_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPhysicalComponentAccess().getNodeKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Alternatives_1"


    // $ANTLR start "rule__Message__Alternatives"
    // InternalDsl.g:785:1: rule__Message__Alternatives : ( ( ruleSequenceMessageType ) | ( ruleArmTimerMessage ) | ( ruleParticipantDeactivation ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:789:1: ( ( ruleSequenceMessageType ) | ( ruleArmTimerMessage ) | ( ruleParticipantDeactivation ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDsl.g:790:2: ( ruleSequenceMessageType )
                    {
                    // InternalDsl.g:790:2: ( ruleSequenceMessageType )
                    // InternalDsl.g:791:3: ruleSequenceMessageType
                    {
                     before(grammarAccess.getMessageAccess().getSequenceMessageTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceMessageType();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getSequenceMessageTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:796:2: ( ruleArmTimerMessage )
                    {
                    // InternalDsl.g:796:2: ( ruleArmTimerMessage )
                    // InternalDsl.g:797:3: ruleArmTimerMessage
                    {
                     before(grammarAccess.getMessageAccess().getArmTimerMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArmTimerMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getArmTimerMessageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:802:2: ( ruleParticipantDeactivation )
                    {
                    // InternalDsl.g:802:2: ( ruleParticipantDeactivation )
                    // InternalDsl.g:803:3: ruleParticipantDeactivation
                    {
                     before(grammarAccess.getMessageAccess().getParticipantDeactivationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParticipantDeactivation();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getParticipantDeactivationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Alternatives"


    // $ANTLR start "rule__SequenceMessageType__Alternatives_0"
    // InternalDsl.g:812:1: rule__SequenceMessageType__Alternatives_0 : ( ( ruleSequenceMessage ) | ( ruleCreateMessage ) | ( ruleDeleteMessage ) );
    public final void rule__SequenceMessageType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:816:1: ( ( ruleSequenceMessage ) | ( ruleCreateMessage ) | ( ruleDeleteMessage ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt12=2;
                    }
                    break;
                case 37:
                    {
                    alt12=3;
                    }
                    break;
                case 34:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:817:2: ( ruleSequenceMessage )
                    {
                    // InternalDsl.g:817:2: ( ruleSequenceMessage )
                    // InternalDsl.g:818:3: ruleSequenceMessage
                    {
                     before(grammarAccess.getSequenceMessageTypeAccess().getSequenceMessageParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceMessage();

                    state._fsp--;

                     after(grammarAccess.getSequenceMessageTypeAccess().getSequenceMessageParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:823:2: ( ruleCreateMessage )
                    {
                    // InternalDsl.g:823:2: ( ruleCreateMessage )
                    // InternalDsl.g:824:3: ruleCreateMessage
                    {
                     before(grammarAccess.getSequenceMessageTypeAccess().getCreateMessageParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateMessage();

                    state._fsp--;

                     after(grammarAccess.getSequenceMessageTypeAccess().getCreateMessageParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:829:2: ( ruleDeleteMessage )
                    {
                    // InternalDsl.g:829:2: ( ruleDeleteMessage )
                    // InternalDsl.g:830:3: ruleDeleteMessage
                    {
                     before(grammarAccess.getSequenceMessageTypeAccess().getDeleteMessageParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteMessage();

                    state._fsp--;

                     after(grammarAccess.getSequenceMessageTypeAccess().getDeleteMessageParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessageType__Alternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDsl.g:839:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:843:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:844:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDsl.g:851:1: rule__Model__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:855:1: ( ( 'scenario' ) )
            // InternalDsl.g:856:1: ( 'scenario' )
            {
            // InternalDsl.g:856:1: ( 'scenario' )
            // InternalDsl.g:857:2: 'scenario'
            {
             before(grammarAccess.getModelAccess().getScenarioKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getScenarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDsl.g:866:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:870:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDsl.g:871:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDsl.g:878:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScenarioTypeAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:882:1: ( ( ( rule__Model__ScenarioTypeAssignment_1 ) ) )
            // InternalDsl.g:883:1: ( ( rule__Model__ScenarioTypeAssignment_1 ) )
            {
            // InternalDsl.g:883:1: ( ( rule__Model__ScenarioTypeAssignment_1 ) )
            // InternalDsl.g:884:2: ( rule__Model__ScenarioTypeAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getScenarioTypeAssignment_1()); 
            // InternalDsl.g:885:2: ( rule__Model__ScenarioTypeAssignment_1 )
            // InternalDsl.g:885:3: rule__Model__ScenarioTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ScenarioTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScenarioTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDsl.g:893:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:897:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDsl.g:898:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDsl.g:905:1: rule__Model__Group__2__Impl : ( ( rule__Model__MessagesOrReferencesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:909:1: ( ( ( rule__Model__MessagesOrReferencesAssignment_2 )* ) )
            // InternalDsl.g:910:1: ( ( rule__Model__MessagesOrReferencesAssignment_2 )* )
            {
            // InternalDsl.g:910:1: ( ( rule__Model__MessagesOrReferencesAssignment_2 )* )
            // InternalDsl.g:911:2: ( rule__Model__MessagesOrReferencesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getMessagesOrReferencesAssignment_2()); 
            // InternalDsl.g:912:2: ( rule__Model__MessagesOrReferencesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=39 && LA13_0<=41)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:912:3: rule__Model__MessagesOrReferencesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__MessagesOrReferencesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMessagesOrReferencesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalDsl.g:920:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:924:1: ( rule__Model__Group__3__Impl )
            // InternalDsl.g:925:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalDsl.g:931:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:935:1: ( ( '}' ) )
            // InternalDsl.g:936:1: ( '}' )
            {
            // InternalDsl.g:936:1: ( '}' )
            // InternalDsl.g:937:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__0"
    // InternalDsl.g:947:1: rule__ScenarioTypeAndParticipants__Group_0__0 : rule__ScenarioTypeAndParticipants__Group_0__0__Impl rule__ScenarioTypeAndParticipants__Group_0__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:951:1: ( rule__ScenarioTypeAndParticipants__Group_0__0__Impl rule__ScenarioTypeAndParticipants__Group_0__1 )
            // InternalDsl.g:952:2: rule__ScenarioTypeAndParticipants__Group_0__0__Impl rule__ScenarioTypeAndParticipants__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioTypeAndParticipants__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__0__Impl"
    // InternalDsl.g:959:1: rule__ScenarioTypeAndParticipants__Group_0__0__Impl : ( 'System' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:963:1: ( ( 'System' ) )
            // InternalDsl.g:964:1: ( 'System' )
            {
            // InternalDsl.g:964:1: ( 'System' )
            // InternalDsl.g:965:2: 'System'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__1"
    // InternalDsl.g:974:1: rule__ScenarioTypeAndParticipants__Group_0__1 : rule__ScenarioTypeAndParticipants__Group_0__1__Impl rule__ScenarioTypeAndParticipants__Group_0__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:978:1: ( rule__ScenarioTypeAndParticipants__Group_0__1__Impl rule__ScenarioTypeAndParticipants__Group_0__2 )
            // InternalDsl.g:979:2: rule__ScenarioTypeAndParticipants__Group_0__1__Impl rule__ScenarioTypeAndParticipants__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__1__Impl"
    // InternalDsl.g:986:1: rule__ScenarioTypeAndParticipants__Group_0__1__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:990:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) ) )
            // InternalDsl.g:991:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) )
            {
            // InternalDsl.g:991:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) )
            // InternalDsl.g:992:2: ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_0_1()); 
            // InternalDsl.g:993:2: ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 )
            // InternalDsl.g:993:3: rule__ScenarioTypeAndParticipants__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__2"
    // InternalDsl.g:1001:1: rule__ScenarioTypeAndParticipants__Group_0__2 : rule__ScenarioTypeAndParticipants__Group_0__2__Impl rule__ScenarioTypeAndParticipants__Group_0__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1005:1: ( rule__ScenarioTypeAndParticipants__Group_0__2__Impl rule__ScenarioTypeAndParticipants__Group_0__3 )
            // InternalDsl.g:1006:2: rule__ScenarioTypeAndParticipants__Group_0__2__Impl rule__ScenarioTypeAndParticipants__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__2__Impl"
    // InternalDsl.g:1013:1: rule__ScenarioTypeAndParticipants__Group_0__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1017:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) ) )
            // InternalDsl.g:1018:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) )
            {
            // InternalDsl.g:1018:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) )
            // InternalDsl.g:1019:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_0_2()); 
            // InternalDsl.g:1020:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 )
            // InternalDsl.g:1020:3: rule__ScenarioTypeAndParticipants__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__3"
    // InternalDsl.g:1028:1: rule__ScenarioTypeAndParticipants__Group_0__3 : rule__ScenarioTypeAndParticipants__Group_0__3__Impl rule__ScenarioTypeAndParticipants__Group_0__4 ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1032:1: ( rule__ScenarioTypeAndParticipants__Group_0__3__Impl rule__ScenarioTypeAndParticipants__Group_0__4 )
            // InternalDsl.g:1033:2: rule__ScenarioTypeAndParticipants__Group_0__3__Impl rule__ScenarioTypeAndParticipants__Group_0__4
            {
            pushFollow(FOLLOW_9);
            rule__ScenarioTypeAndParticipants__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__3__Impl"
    // InternalDsl.g:1040:1: rule__ScenarioTypeAndParticipants__Group_0__3__Impl : ( '{' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1044:1: ( ( '{' ) )
            // InternalDsl.g:1045:1: ( '{' )
            {
            // InternalDsl.g:1045:1: ( '{' )
            // InternalDsl.g:1046:2: '{'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__4"
    // InternalDsl.g:1055:1: rule__ScenarioTypeAndParticipants__Group_0__4 : rule__ScenarioTypeAndParticipants__Group_0__4__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1059:1: ( rule__ScenarioTypeAndParticipants__Group_0__4__Impl )
            // InternalDsl.g:1060:2: rule__ScenarioTypeAndParticipants__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__4__Impl"
    // InternalDsl.g:1066:1: rule__ScenarioTypeAndParticipants__Group_0__4__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1070:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4 )* ) )
            // InternalDsl.g:1071:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4 )* )
            {
            // InternalDsl.g:1071:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4 )* )
            // InternalDsl.g:1072:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_0_4()); 
            // InternalDsl.g:1073:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1073:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__4__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__0"
    // InternalDsl.g:1082:1: rule__ScenarioTypeAndParticipants__Group_1__0 : rule__ScenarioTypeAndParticipants__Group_1__0__Impl rule__ScenarioTypeAndParticipants__Group_1__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1086:1: ( rule__ScenarioTypeAndParticipants__Group_1__0__Impl rule__ScenarioTypeAndParticipants__Group_1__1 )
            // InternalDsl.g:1087:2: rule__ScenarioTypeAndParticipants__Group_1__0__Impl rule__ScenarioTypeAndParticipants__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioTypeAndParticipants__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__0__Impl"
    // InternalDsl.g:1094:1: rule__ScenarioTypeAndParticipants__Group_1__0__Impl : ( 'Logical' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1098:1: ( ( 'Logical' ) )
            // InternalDsl.g:1099:1: ( 'Logical' )
            {
            // InternalDsl.g:1099:1: ( 'Logical' )
            // InternalDsl.g:1100:2: 'Logical'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__1"
    // InternalDsl.g:1109:1: rule__ScenarioTypeAndParticipants__Group_1__1 : rule__ScenarioTypeAndParticipants__Group_1__1__Impl rule__ScenarioTypeAndParticipants__Group_1__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1113:1: ( rule__ScenarioTypeAndParticipants__Group_1__1__Impl rule__ScenarioTypeAndParticipants__Group_1__2 )
            // InternalDsl.g:1114:2: rule__ScenarioTypeAndParticipants__Group_1__1__Impl rule__ScenarioTypeAndParticipants__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__1__Impl"
    // InternalDsl.g:1121:1: rule__ScenarioTypeAndParticipants__Group_1__1__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1125:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) ) )
            // InternalDsl.g:1126:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) )
            {
            // InternalDsl.g:1126:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) )
            // InternalDsl.g:1127:2: ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_1_1()); 
            // InternalDsl.g:1128:2: ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 )
            // InternalDsl.g:1128:3: rule__ScenarioTypeAndParticipants__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__2"
    // InternalDsl.g:1136:1: rule__ScenarioTypeAndParticipants__Group_1__2 : rule__ScenarioTypeAndParticipants__Group_1__2__Impl rule__ScenarioTypeAndParticipants__Group_1__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1140:1: ( rule__ScenarioTypeAndParticipants__Group_1__2__Impl rule__ScenarioTypeAndParticipants__Group_1__3 )
            // InternalDsl.g:1141:2: rule__ScenarioTypeAndParticipants__Group_1__2__Impl rule__ScenarioTypeAndParticipants__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__2__Impl"
    // InternalDsl.g:1148:1: rule__ScenarioTypeAndParticipants__Group_1__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1152:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) ) )
            // InternalDsl.g:1153:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) )
            {
            // InternalDsl.g:1153:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) )
            // InternalDsl.g:1154:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_1_2()); 
            // InternalDsl.g:1155:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 )
            // InternalDsl.g:1155:3: rule__ScenarioTypeAndParticipants__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__3"
    // InternalDsl.g:1163:1: rule__ScenarioTypeAndParticipants__Group_1__3 : rule__ScenarioTypeAndParticipants__Group_1__3__Impl rule__ScenarioTypeAndParticipants__Group_1__4 ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1167:1: ( rule__ScenarioTypeAndParticipants__Group_1__3__Impl rule__ScenarioTypeAndParticipants__Group_1__4 )
            // InternalDsl.g:1168:2: rule__ScenarioTypeAndParticipants__Group_1__3__Impl rule__ScenarioTypeAndParticipants__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__ScenarioTypeAndParticipants__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__3__Impl"
    // InternalDsl.g:1175:1: rule__ScenarioTypeAndParticipants__Group_1__3__Impl : ( '{' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1179:1: ( ( '{' ) )
            // InternalDsl.g:1180:1: ( '{' )
            {
            // InternalDsl.g:1180:1: ( '{' )
            // InternalDsl.g:1181:2: '{'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__4"
    // InternalDsl.g:1190:1: rule__ScenarioTypeAndParticipants__Group_1__4 : rule__ScenarioTypeAndParticipants__Group_1__4__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1194:1: ( rule__ScenarioTypeAndParticipants__Group_1__4__Impl )
            // InternalDsl.g:1195:2: rule__ScenarioTypeAndParticipants__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__4__Impl"
    // InternalDsl.g:1201:1: rule__ScenarioTypeAndParticipants__Group_1__4__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1205:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4 )* ) )
            // InternalDsl.g:1206:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4 )* )
            {
            // InternalDsl.g:1206:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4 )* )
            // InternalDsl.g:1207:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_1_4()); 
            // InternalDsl.g:1208:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1208:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__4__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__0"
    // InternalDsl.g:1217:1: rule__ScenarioTypeAndParticipants__Group_2__0 : rule__ScenarioTypeAndParticipants__Group_2__0__Impl rule__ScenarioTypeAndParticipants__Group_2__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1221:1: ( rule__ScenarioTypeAndParticipants__Group_2__0__Impl rule__ScenarioTypeAndParticipants__Group_2__1 )
            // InternalDsl.g:1222:2: rule__ScenarioTypeAndParticipants__Group_2__0__Impl rule__ScenarioTypeAndParticipants__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioTypeAndParticipants__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__0__Impl"
    // InternalDsl.g:1229:1: rule__ScenarioTypeAndParticipants__Group_2__0__Impl : ( 'Physical' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1233:1: ( ( 'Physical' ) )
            // InternalDsl.g:1234:1: ( 'Physical' )
            {
            // InternalDsl.g:1234:1: ( 'Physical' )
            // InternalDsl.g:1235:2: 'Physical'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__1"
    // InternalDsl.g:1244:1: rule__ScenarioTypeAndParticipants__Group_2__1 : rule__ScenarioTypeAndParticipants__Group_2__1__Impl rule__ScenarioTypeAndParticipants__Group_2__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1248:1: ( rule__ScenarioTypeAndParticipants__Group_2__1__Impl rule__ScenarioTypeAndParticipants__Group_2__2 )
            // InternalDsl.g:1249:2: rule__ScenarioTypeAndParticipants__Group_2__1__Impl rule__ScenarioTypeAndParticipants__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__1__Impl"
    // InternalDsl.g:1256:1: rule__ScenarioTypeAndParticipants__Group_2__1__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1260:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) ) )
            // InternalDsl.g:1261:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) )
            {
            // InternalDsl.g:1261:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) )
            // InternalDsl.g:1262:2: ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_2_1()); 
            // InternalDsl.g:1263:2: ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 )
            // InternalDsl.g:1263:3: rule__ScenarioTypeAndParticipants__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__2"
    // InternalDsl.g:1271:1: rule__ScenarioTypeAndParticipants__Group_2__2 : rule__ScenarioTypeAndParticipants__Group_2__2__Impl rule__ScenarioTypeAndParticipants__Group_2__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1275:1: ( rule__ScenarioTypeAndParticipants__Group_2__2__Impl rule__ScenarioTypeAndParticipants__Group_2__3 )
            // InternalDsl.g:1276:2: rule__ScenarioTypeAndParticipants__Group_2__2__Impl rule__ScenarioTypeAndParticipants__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__2__Impl"
    // InternalDsl.g:1283:1: rule__ScenarioTypeAndParticipants__Group_2__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1287:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) ) )
            // InternalDsl.g:1288:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) )
            {
            // InternalDsl.g:1288:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) )
            // InternalDsl.g:1289:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_2_2()); 
            // InternalDsl.g:1290:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 )
            // InternalDsl.g:1290:3: rule__ScenarioTypeAndParticipants__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__3"
    // InternalDsl.g:1298:1: rule__ScenarioTypeAndParticipants__Group_2__3 : rule__ScenarioTypeAndParticipants__Group_2__3__Impl rule__ScenarioTypeAndParticipants__Group_2__4 ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1302:1: ( rule__ScenarioTypeAndParticipants__Group_2__3__Impl rule__ScenarioTypeAndParticipants__Group_2__4 )
            // InternalDsl.g:1303:2: rule__ScenarioTypeAndParticipants__Group_2__3__Impl rule__ScenarioTypeAndParticipants__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__ScenarioTypeAndParticipants__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__3__Impl"
    // InternalDsl.g:1310:1: rule__ScenarioTypeAndParticipants__Group_2__3__Impl : ( '{' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1314:1: ( ( '{' ) )
            // InternalDsl.g:1315:1: ( '{' )
            {
            // InternalDsl.g:1315:1: ( '{' )
            // InternalDsl.g:1316:2: '{'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__4"
    // InternalDsl.g:1325:1: rule__ScenarioTypeAndParticipants__Group_2__4 : rule__ScenarioTypeAndParticipants__Group_2__4__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1329:1: ( rule__ScenarioTypeAndParticipants__Group_2__4__Impl )
            // InternalDsl.g:1330:2: rule__ScenarioTypeAndParticipants__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__4__Impl"
    // InternalDsl.g:1336:1: rule__ScenarioTypeAndParticipants__Group_2__4__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1340:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4 )* ) )
            // InternalDsl.g:1341:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4 )* )
            {
            // InternalDsl.g:1341:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4 )* )
            // InternalDsl.g:1342:2: ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAssignment_2_4()); 
            // InternalDsl.g:1343:2: ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1343:3: rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__4__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__0"
    // InternalDsl.g:1352:1: rule__ScenarioTypeAndParticipants__Group_3__0 : rule__ScenarioTypeAndParticipants__Group_3__0__Impl rule__ScenarioTypeAndParticipants__Group_3__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1356:1: ( rule__ScenarioTypeAndParticipants__Group_3__0__Impl rule__ScenarioTypeAndParticipants__Group_3__1 )
            // InternalDsl.g:1357:2: rule__ScenarioTypeAndParticipants__Group_3__0__Impl rule__ScenarioTypeAndParticipants__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ScenarioTypeAndParticipants__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__0__Impl"
    // InternalDsl.g:1364:1: rule__ScenarioTypeAndParticipants__Group_3__0__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1368:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) ) )
            // InternalDsl.g:1369:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) )
            {
            // InternalDsl.g:1369:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) )
            // InternalDsl.g:1370:2: ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_3_0()); 
            // InternalDsl.g:1371:2: ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 )
            // InternalDsl.g:1371:3: rule__ScenarioTypeAndParticipants__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__1"
    // InternalDsl.g:1379:1: rule__ScenarioTypeAndParticipants__Group_3__1 : rule__ScenarioTypeAndParticipants__Group_3__1__Impl rule__ScenarioTypeAndParticipants__Group_3__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1383:1: ( rule__ScenarioTypeAndParticipants__Group_3__1__Impl rule__ScenarioTypeAndParticipants__Group_3__2 )
            // InternalDsl.g:1384:2: rule__ScenarioTypeAndParticipants__Group_3__1__Impl rule__ScenarioTypeAndParticipants__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__1__Impl"
    // InternalDsl.g:1391:1: rule__ScenarioTypeAndParticipants__Group_3__1__Impl : ( 'FS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1395:1: ( ( 'FS' ) )
            // InternalDsl.g:1396:1: ( 'FS' )
            {
            // InternalDsl.g:1396:1: ( 'FS' )
            // InternalDsl.g:1397:2: 'FS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getFSKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getFSKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__2"
    // InternalDsl.g:1406:1: rule__ScenarioTypeAndParticipants__Group_3__2 : rule__ScenarioTypeAndParticipants__Group_3__2__Impl rule__ScenarioTypeAndParticipants__Group_3__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1410:1: ( rule__ScenarioTypeAndParticipants__Group_3__2__Impl rule__ScenarioTypeAndParticipants__Group_3__3 )
            // InternalDsl.g:1411:2: rule__ScenarioTypeAndParticipants__Group_3__2__Impl rule__ScenarioTypeAndParticipants__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__2__Impl"
    // InternalDsl.g:1418:1: rule__ScenarioTypeAndParticipants__Group_3__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1422:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) ) )
            // InternalDsl.g:1423:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) )
            {
            // InternalDsl.g:1423:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) )
            // InternalDsl.g:1424:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_3_2()); 
            // InternalDsl.g:1425:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 )
            // InternalDsl.g:1425:3: rule__ScenarioTypeAndParticipants__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__3"
    // InternalDsl.g:1433:1: rule__ScenarioTypeAndParticipants__Group_3__3 : rule__ScenarioTypeAndParticipants__Group_3__3__Impl rule__ScenarioTypeAndParticipants__Group_3__4 ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1437:1: ( rule__ScenarioTypeAndParticipants__Group_3__3__Impl rule__ScenarioTypeAndParticipants__Group_3__4 )
            // InternalDsl.g:1438:2: rule__ScenarioTypeAndParticipants__Group_3__3__Impl rule__ScenarioTypeAndParticipants__Group_3__4
            {
            pushFollow(FOLLOW_14);
            rule__ScenarioTypeAndParticipants__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__3__Impl"
    // InternalDsl.g:1445:1: rule__ScenarioTypeAndParticipants__Group_3__3__Impl : ( '{' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1449:1: ( ( '{' ) )
            // InternalDsl.g:1450:1: ( '{' )
            {
            // InternalDsl.g:1450:1: ( '{' )
            // InternalDsl.g:1451:2: '{'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_3_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__4"
    // InternalDsl.g:1460:1: rule__ScenarioTypeAndParticipants__Group_3__4 : rule__ScenarioTypeAndParticipants__Group_3__4__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1464:1: ( rule__ScenarioTypeAndParticipants__Group_3__4__Impl )
            // InternalDsl.g:1465:2: rule__ScenarioTypeAndParticipants__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__4__Impl"
    // InternalDsl.g:1471:1: rule__ScenarioTypeAndParticipants__Group_3__4__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1475:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4 )* ) )
            // InternalDsl.g:1476:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4 )* )
            {
            // InternalDsl.g:1476:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4 )* )
            // InternalDsl.g:1477:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_3_4()); 
            // InternalDsl.g:1478:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1478:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__4__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__0"
    // InternalDsl.g:1487:1: rule__ScenarioTypeAndParticipants__Group_4__0 : rule__ScenarioTypeAndParticipants__Group_4__0__Impl rule__ScenarioTypeAndParticipants__Group_4__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1491:1: ( rule__ScenarioTypeAndParticipants__Group_4__0__Impl rule__ScenarioTypeAndParticipants__Group_4__1 )
            // InternalDsl.g:1492:2: rule__ScenarioTypeAndParticipants__Group_4__0__Impl rule__ScenarioTypeAndParticipants__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ScenarioTypeAndParticipants__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__0__Impl"
    // InternalDsl.g:1499:1: rule__ScenarioTypeAndParticipants__Group_4__0__Impl : ( 'EPBS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1503:1: ( ( 'EPBS' ) )
            // InternalDsl.g:1504:1: ( 'EPBS' )
            {
            // InternalDsl.g:1504:1: ( 'EPBS' )
            // InternalDsl.g:1505:2: 'EPBS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getEPBSKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getEPBSKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__1"
    // InternalDsl.g:1514:1: rule__ScenarioTypeAndParticipants__Group_4__1 : rule__ScenarioTypeAndParticipants__Group_4__1__Impl rule__ScenarioTypeAndParticipants__Group_4__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1518:1: ( rule__ScenarioTypeAndParticipants__Group_4__1__Impl rule__ScenarioTypeAndParticipants__Group_4__2 )
            // InternalDsl.g:1519:2: rule__ScenarioTypeAndParticipants__Group_4__1__Impl rule__ScenarioTypeAndParticipants__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__1__Impl"
    // InternalDsl.g:1526:1: rule__ScenarioTypeAndParticipants__Group_4__1__Impl : ( 'IS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1530:1: ( ( 'IS' ) )
            // InternalDsl.g:1531:1: ( 'IS' )
            {
            // InternalDsl.g:1531:1: ( 'IS' )
            // InternalDsl.g:1532:2: 'IS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_4_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__2"
    // InternalDsl.g:1541:1: rule__ScenarioTypeAndParticipants__Group_4__2 : rule__ScenarioTypeAndParticipants__Group_4__2__Impl rule__ScenarioTypeAndParticipants__Group_4__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1545:1: ( rule__ScenarioTypeAndParticipants__Group_4__2__Impl rule__ScenarioTypeAndParticipants__Group_4__3 )
            // InternalDsl.g:1546:2: rule__ScenarioTypeAndParticipants__Group_4__2__Impl rule__ScenarioTypeAndParticipants__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__2__Impl"
    // InternalDsl.g:1553:1: rule__ScenarioTypeAndParticipants__Group_4__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1557:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) ) )
            // InternalDsl.g:1558:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) )
            {
            // InternalDsl.g:1558:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) )
            // InternalDsl.g:1559:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_4_2()); 
            // InternalDsl.g:1560:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 )
            // InternalDsl.g:1560:3: rule__ScenarioTypeAndParticipants__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__3"
    // InternalDsl.g:1568:1: rule__ScenarioTypeAndParticipants__Group_4__3 : rule__ScenarioTypeAndParticipants__Group_4__3__Impl rule__ScenarioTypeAndParticipants__Group_4__4 ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1572:1: ( rule__ScenarioTypeAndParticipants__Group_4__3__Impl rule__ScenarioTypeAndParticipants__Group_4__4 )
            // InternalDsl.g:1573:2: rule__ScenarioTypeAndParticipants__Group_4__3__Impl rule__ScenarioTypeAndParticipants__Group_4__4
            {
            pushFollow(FOLLOW_17);
            rule__ScenarioTypeAndParticipants__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__3__Impl"
    // InternalDsl.g:1580:1: rule__ScenarioTypeAndParticipants__Group_4__3__Impl : ( '{' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1584:1: ( ( '{' ) )
            // InternalDsl.g:1585:1: ( '{' )
            {
            // InternalDsl.g:1585:1: ( '{' )
            // InternalDsl.g:1586:2: '{'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_4_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__4"
    // InternalDsl.g:1595:1: rule__ScenarioTypeAndParticipants__Group_4__4 : rule__ScenarioTypeAndParticipants__Group_4__4__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1599:1: ( rule__ScenarioTypeAndParticipants__Group_4__4__Impl )
            // InternalDsl.g:1600:2: rule__ScenarioTypeAndParticipants__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__4__Impl"
    // InternalDsl.g:1606:1: rule__ScenarioTypeAndParticipants__Group_4__4__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1610:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4 )* ) )
            // InternalDsl.g:1611:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4 )* )
            {
            // InternalDsl.g:1611:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4 )* )
            // InternalDsl.g:1612:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_4_4()); 
            // InternalDsl.g:1613:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1613:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__4__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__0"
    // InternalDsl.g:1622:1: rule__ScenarioTypeAndParticipants__Group_5__0 : rule__ScenarioTypeAndParticipants__Group_5__0__Impl rule__ScenarioTypeAndParticipants__Group_5__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1626:1: ( rule__ScenarioTypeAndParticipants__Group_5__0__Impl rule__ScenarioTypeAndParticipants__Group_5__1 )
            // InternalDsl.g:1627:2: rule__ScenarioTypeAndParticipants__Group_5__0__Impl rule__ScenarioTypeAndParticipants__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__0__Impl"
    // InternalDsl.g:1634:1: rule__ScenarioTypeAndParticipants__Group_5__0__Impl : ( 'OAS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1638:1: ( ( 'OAS' ) )
            // InternalDsl.g:1639:1: ( 'OAS' )
            {
            // InternalDsl.g:1639:1: ( 'OAS' )
            // InternalDsl.g:1640:2: 'OAS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getOASKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getOASKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__1"
    // InternalDsl.g:1649:1: rule__ScenarioTypeAndParticipants__Group_5__1 : rule__ScenarioTypeAndParticipants__Group_5__1__Impl rule__ScenarioTypeAndParticipants__Group_5__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1653:1: ( rule__ScenarioTypeAndParticipants__Group_5__1__Impl rule__ScenarioTypeAndParticipants__Group_5__2 )
            // InternalDsl.g:1654:2: rule__ScenarioTypeAndParticipants__Group_5__1__Impl rule__ScenarioTypeAndParticipants__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__1__Impl"
    // InternalDsl.g:1661:1: rule__ScenarioTypeAndParticipants__Group_5__1__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1665:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) ) )
            // InternalDsl.g:1666:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) )
            {
            // InternalDsl.g:1666:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) )
            // InternalDsl.g:1667:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_5_1()); 
            // InternalDsl.g:1668:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 )
            // InternalDsl.g:1668:3: rule__ScenarioTypeAndParticipants__NameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__2"
    // InternalDsl.g:1676:1: rule__ScenarioTypeAndParticipants__Group_5__2 : rule__ScenarioTypeAndParticipants__Group_5__2__Impl rule__ScenarioTypeAndParticipants__Group_5__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1680:1: ( rule__ScenarioTypeAndParticipants__Group_5__2__Impl rule__ScenarioTypeAndParticipants__Group_5__3 )
            // InternalDsl.g:1681:2: rule__ScenarioTypeAndParticipants__Group_5__2__Impl rule__ScenarioTypeAndParticipants__Group_5__3
            {
            pushFollow(FOLLOW_19);
            rule__ScenarioTypeAndParticipants__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__2__Impl"
    // InternalDsl.g:1688:1: rule__ScenarioTypeAndParticipants__Group_5__2__Impl : ( '{' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1692:1: ( ( '{' ) )
            // InternalDsl.g:1693:1: ( '{' )
            {
            // InternalDsl.g:1693:1: ( '{' )
            // InternalDsl.g:1694:2: '{'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_5_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__3"
    // InternalDsl.g:1703:1: rule__ScenarioTypeAndParticipants__Group_5__3 : rule__ScenarioTypeAndParticipants__Group_5__3__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1707:1: ( rule__ScenarioTypeAndParticipants__Group_5__3__Impl )
            // InternalDsl.g:1708:2: rule__ScenarioTypeAndParticipants__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__3__Impl"
    // InternalDsl.g:1714:1: rule__ScenarioTypeAndParticipants__Group_5__3__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1718:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3 )* ) )
            // InternalDsl.g:1719:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3 )* )
            {
            // InternalDsl.g:1719:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3 )* )
            // InternalDsl.g:1720:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_5_3()); 
            // InternalDsl.g:1721:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:1721:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__0"
    // InternalDsl.g:1730:1: rule__ScenarioTypeAndParticipants__Group_6__0 : rule__ScenarioTypeAndParticipants__Group_6__0__Impl rule__ScenarioTypeAndParticipants__Group_6__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1734:1: ( rule__ScenarioTypeAndParticipants__Group_6__0__Impl rule__ScenarioTypeAndParticipants__Group_6__1 )
            // InternalDsl.g:1735:2: rule__ScenarioTypeAndParticipants__Group_6__0__Impl rule__ScenarioTypeAndParticipants__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__0__Impl"
    // InternalDsl.g:1742:1: rule__ScenarioTypeAndParticipants__Group_6__0__Impl : ( 'OES' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1746:1: ( ( 'OES' ) )
            // InternalDsl.g:1747:1: ( 'OES' )
            {
            // InternalDsl.g:1747:1: ( 'OES' )
            // InternalDsl.g:1748:2: 'OES'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getOESKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getOESKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__1"
    // InternalDsl.g:1757:1: rule__ScenarioTypeAndParticipants__Group_6__1 : rule__ScenarioTypeAndParticipants__Group_6__1__Impl rule__ScenarioTypeAndParticipants__Group_6__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1761:1: ( rule__ScenarioTypeAndParticipants__Group_6__1__Impl rule__ScenarioTypeAndParticipants__Group_6__2 )
            // InternalDsl.g:1762:2: rule__ScenarioTypeAndParticipants__Group_6__1__Impl rule__ScenarioTypeAndParticipants__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__1__Impl"
    // InternalDsl.g:1769:1: rule__ScenarioTypeAndParticipants__Group_6__1__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1773:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) ) )
            // InternalDsl.g:1774:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) )
            {
            // InternalDsl.g:1774:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) )
            // InternalDsl.g:1775:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_6_1()); 
            // InternalDsl.g:1776:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 )
            // InternalDsl.g:1776:3: rule__ScenarioTypeAndParticipants__NameAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__2"
    // InternalDsl.g:1784:1: rule__ScenarioTypeAndParticipants__Group_6__2 : rule__ScenarioTypeAndParticipants__Group_6__2__Impl rule__ScenarioTypeAndParticipants__Group_6__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1788:1: ( rule__ScenarioTypeAndParticipants__Group_6__2__Impl rule__ScenarioTypeAndParticipants__Group_6__3 )
            // InternalDsl.g:1789:2: rule__ScenarioTypeAndParticipants__Group_6__2__Impl rule__ScenarioTypeAndParticipants__Group_6__3
            {
            pushFollow(FOLLOW_21);
            rule__ScenarioTypeAndParticipants__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__2__Impl"
    // InternalDsl.g:1796:1: rule__ScenarioTypeAndParticipants__Group_6__2__Impl : ( '{' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1800:1: ( ( '{' ) )
            // InternalDsl.g:1801:1: ( '{' )
            {
            // InternalDsl.g:1801:1: ( '{' )
            // InternalDsl.g:1802:2: '{'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_6_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__3"
    // InternalDsl.g:1811:1: rule__ScenarioTypeAndParticipants__Group_6__3 : rule__ScenarioTypeAndParticipants__Group_6__3__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1815:1: ( rule__ScenarioTypeAndParticipants__Group_6__3__Impl )
            // InternalDsl.g:1816:2: rule__ScenarioTypeAndParticipants__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__3__Impl"
    // InternalDsl.g:1822:1: rule__ScenarioTypeAndParticipants__Group_6__3__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1826:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3 )* ) )
            // InternalDsl.g:1827:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3 )* )
            {
            // InternalDsl.g:1827:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3 )* )
            // InternalDsl.g:1828:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_6_3()); 
            // InternalDsl.g:1829:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26||(LA20_0>=32 && LA20_0<=33)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:1829:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__3__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalDsl.g:1838:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1842:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalDsl.g:1843:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalDsl.g:1850:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1854:1: ( ( 'actor' ) )
            // InternalDsl.g:1855:1: ( 'actor' )
            {
            // InternalDsl.g:1855:1: ( 'actor' )
            // InternalDsl.g:1856:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalDsl.g:1865:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1869:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalDsl.g:1870:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalDsl.g:1877:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1881:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalDsl.g:1882:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalDsl.g:1882:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalDsl.g:1883:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalDsl.g:1884:2: ( rule__Actor__NameAssignment_1 )
            // InternalDsl.g:1884:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalDsl.g:1892:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1896:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalDsl.g:1897:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalDsl.g:1904:1: rule__Actor__Group__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1908:1: ( ( 'as' ) )
            // InternalDsl.g:1909:1: ( 'as' )
            {
            // InternalDsl.g:1909:1: ( 'as' )
            // InternalDsl.g:1910:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalDsl.g:1919:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1923:1: ( rule__Actor__Group__3__Impl )
            // InternalDsl.g:1924:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalDsl.g:1930:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__IdAssignment_3 ) ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1934:1: ( ( ( rule__Actor__IdAssignment_3 ) ) )
            // InternalDsl.g:1935:1: ( ( rule__Actor__IdAssignment_3 ) )
            {
            // InternalDsl.g:1935:1: ( ( rule__Actor__IdAssignment_3 ) )
            // InternalDsl.g:1936:2: ( rule__Actor__IdAssignment_3 )
            {
             before(grammarAccess.getActorAccess().getIdAssignment_3()); 
            // InternalDsl.g:1937:2: ( rule__Actor__IdAssignment_3 )
            // InternalDsl.g:1937:3: rule__Actor__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Actor__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalDsl.g:1946:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1950:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDsl.g:1951:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalDsl.g:1958:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1962:1: ( ( 'component' ) )
            // InternalDsl.g:1963:1: ( 'component' )
            {
            // InternalDsl.g:1963:1: ( 'component' )
            // InternalDsl.g:1964:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalDsl.g:1973:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1977:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDsl.g:1978:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalDsl.g:1985:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1989:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalDsl.g:1990:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalDsl.g:1990:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalDsl.g:1991:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalDsl.g:1992:2: ( rule__Component__NameAssignment_1 )
            // InternalDsl.g:1992:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalDsl.g:2000:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2004:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDsl.g:2005:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalDsl.g:2012:1: rule__Component__Group__2__Impl : ( 'as' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2016:1: ( ( 'as' ) )
            // InternalDsl.g:2017:1: ( 'as' )
            {
            // InternalDsl.g:2017:1: ( 'as' )
            // InternalDsl.g:2018:2: 'as'
            {
             before(grammarAccess.getComponentAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalDsl.g:2027:1: rule__Component__Group__3 : rule__Component__Group__3__Impl ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2031:1: ( rule__Component__Group__3__Impl )
            // InternalDsl.g:2032:2: rule__Component__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalDsl.g:2038:1: rule__Component__Group__3__Impl : ( ( rule__Component__IdAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2042:1: ( ( ( rule__Component__IdAssignment_3 ) ) )
            // InternalDsl.g:2043:1: ( ( rule__Component__IdAssignment_3 ) )
            {
            // InternalDsl.g:2043:1: ( ( rule__Component__IdAssignment_3 ) )
            // InternalDsl.g:2044:2: ( rule__Component__IdAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getIdAssignment_3()); 
            // InternalDsl.g:2045:2: ( rule__Component__IdAssignment_3 )
            // InternalDsl.g:2045:3: rule__Component__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__PhysicalComponent__Group__0"
    // InternalDsl.g:2054:1: rule__PhysicalComponent__Group__0 : rule__PhysicalComponent__Group__0__Impl rule__PhysicalComponent__Group__1 ;
    public final void rule__PhysicalComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2058:1: ( rule__PhysicalComponent__Group__0__Impl rule__PhysicalComponent__Group__1 )
            // InternalDsl.g:2059:2: rule__PhysicalComponent__Group__0__Impl rule__PhysicalComponent__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__PhysicalComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__0"


    // $ANTLR start "rule__PhysicalComponent__Group__0__Impl"
    // InternalDsl.g:2066:1: rule__PhysicalComponent__Group__0__Impl : ( ( rule__PhysicalComponent__ComponentAssignment_0 ) ) ;
    public final void rule__PhysicalComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2070:1: ( ( ( rule__PhysicalComponent__ComponentAssignment_0 ) ) )
            // InternalDsl.g:2071:1: ( ( rule__PhysicalComponent__ComponentAssignment_0 ) )
            {
            // InternalDsl.g:2071:1: ( ( rule__PhysicalComponent__ComponentAssignment_0 ) )
            // InternalDsl.g:2072:2: ( rule__PhysicalComponent__ComponentAssignment_0 )
            {
             before(grammarAccess.getPhysicalComponentAccess().getComponentAssignment_0()); 
            // InternalDsl.g:2073:2: ( rule__PhysicalComponent__ComponentAssignment_0 )
            // InternalDsl.g:2073:3: rule__PhysicalComponent__ComponentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalComponentAccess().getComponentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__0__Impl"


    // $ANTLR start "rule__PhysicalComponent__Group__1"
    // InternalDsl.g:2081:1: rule__PhysicalComponent__Group__1 : rule__PhysicalComponent__Group__1__Impl ;
    public final void rule__PhysicalComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2085:1: ( rule__PhysicalComponent__Group__1__Impl )
            // InternalDsl.g:2086:2: rule__PhysicalComponent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__1"


    // $ANTLR start "rule__PhysicalComponent__Group__1__Impl"
    // InternalDsl.g:2092:1: rule__PhysicalComponent__Group__1__Impl : ( ( rule__PhysicalComponent__Alternatives_1 )? ) ;
    public final void rule__PhysicalComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2096:1: ( ( ( rule__PhysicalComponent__Alternatives_1 )? ) )
            // InternalDsl.g:2097:1: ( ( rule__PhysicalComponent__Alternatives_1 )? )
            {
            // InternalDsl.g:2097:1: ( ( rule__PhysicalComponent__Alternatives_1 )? )
            // InternalDsl.g:2098:2: ( rule__PhysicalComponent__Alternatives_1 )?
            {
             before(grammarAccess.getPhysicalComponentAccess().getAlternatives_1()); 
            // InternalDsl.g:2099:2: ( rule__PhysicalComponent__Alternatives_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=16 && LA21_0<=18)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2099:3: rule__PhysicalComponent__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicalComponent__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicalComponentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__0"
    // InternalDsl.g:2108:1: rule__ConfigurationItem__Group__0 : rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 ;
    public final void rule__ConfigurationItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2112:1: ( rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 )
            // InternalDsl.g:2113:2: rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ConfigurationItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__0"


    // $ANTLR start "rule__ConfigurationItem__Group__0__Impl"
    // InternalDsl.g:2120:1: rule__ConfigurationItem__Group__0__Impl : ( 'configuration_item' ) ;
    public final void rule__ConfigurationItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2124:1: ( ( 'configuration_item' ) )
            // InternalDsl.g:2125:1: ( 'configuration_item' )
            {
            // InternalDsl.g:2125:1: ( 'configuration_item' )
            // InternalDsl.g:2126:2: 'configuration_item'
            {
             before(grammarAccess.getConfigurationItemAccess().getConfiguration_itemKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getConfiguration_itemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__1"
    // InternalDsl.g:2135:1: rule__ConfigurationItem__Group__1 : rule__ConfigurationItem__Group__1__Impl rule__ConfigurationItem__Group__2 ;
    public final void rule__ConfigurationItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2139:1: ( rule__ConfigurationItem__Group__1__Impl rule__ConfigurationItem__Group__2 )
            // InternalDsl.g:2140:2: rule__ConfigurationItem__Group__1__Impl rule__ConfigurationItem__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ConfigurationItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__1"


    // $ANTLR start "rule__ConfigurationItem__Group__1__Impl"
    // InternalDsl.g:2147:1: rule__ConfigurationItem__Group__1__Impl : ( ( rule__ConfigurationItem__NameAssignment_1 ) ) ;
    public final void rule__ConfigurationItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2151:1: ( ( ( rule__ConfigurationItem__NameAssignment_1 ) ) )
            // InternalDsl.g:2152:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            {
            // InternalDsl.g:2152:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            // InternalDsl.g:2153:2: ( rule__ConfigurationItem__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationItemAccess().getNameAssignment_1()); 
            // InternalDsl.g:2154:2: ( rule__ConfigurationItem__NameAssignment_1 )
            // InternalDsl.g:2154:3: rule__ConfigurationItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__2"
    // InternalDsl.g:2162:1: rule__ConfigurationItem__Group__2 : rule__ConfigurationItem__Group__2__Impl rule__ConfigurationItem__Group__3 ;
    public final void rule__ConfigurationItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2166:1: ( rule__ConfigurationItem__Group__2__Impl rule__ConfigurationItem__Group__3 )
            // InternalDsl.g:2167:2: rule__ConfigurationItem__Group__2__Impl rule__ConfigurationItem__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ConfigurationItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__2"


    // $ANTLR start "rule__ConfigurationItem__Group__2__Impl"
    // InternalDsl.g:2174:1: rule__ConfigurationItem__Group__2__Impl : ( 'as' ) ;
    public final void rule__ConfigurationItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2178:1: ( ( 'as' ) )
            // InternalDsl.g:2179:1: ( 'as' )
            {
            // InternalDsl.g:2179:1: ( 'as' )
            // InternalDsl.g:2180:2: 'as'
            {
             before(grammarAccess.getConfigurationItemAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__3"
    // InternalDsl.g:2189:1: rule__ConfigurationItem__Group__3 : rule__ConfigurationItem__Group__3__Impl ;
    public final void rule__ConfigurationItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2193:1: ( rule__ConfigurationItem__Group__3__Impl )
            // InternalDsl.g:2194:2: rule__ConfigurationItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__3"


    // $ANTLR start "rule__ConfigurationItem__Group__3__Impl"
    // InternalDsl.g:2200:1: rule__ConfigurationItem__Group__3__Impl : ( ( rule__ConfigurationItem__IdAssignment_3 ) ) ;
    public final void rule__ConfigurationItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2204:1: ( ( ( rule__ConfigurationItem__IdAssignment_3 ) ) )
            // InternalDsl.g:2205:1: ( ( rule__ConfigurationItem__IdAssignment_3 ) )
            {
            // InternalDsl.g:2205:1: ( ( rule__ConfigurationItem__IdAssignment_3 ) )
            // InternalDsl.g:2206:2: ( rule__ConfigurationItem__IdAssignment_3 )
            {
             before(grammarAccess.getConfigurationItemAccess().getIdAssignment_3()); 
            // InternalDsl.g:2207:2: ( rule__ConfigurationItem__IdAssignment_3 )
            // InternalDsl.g:2207:3: rule__ConfigurationItem__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalDsl.g:2216:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2220:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalDsl.g:2221:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalDsl.g:2228:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2232:1: ( ( 'function' ) )
            // InternalDsl.g:2233:1: ( 'function' )
            {
            // InternalDsl.g:2233:1: ( 'function' )
            // InternalDsl.g:2234:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalDsl.g:2243:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2247:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalDsl.g:2248:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalDsl.g:2255:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2259:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalDsl.g:2260:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalDsl.g:2260:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalDsl.g:2261:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalDsl.g:2262:2: ( rule__Function__NameAssignment_1 )
            // InternalDsl.g:2262:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalDsl.g:2270:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2274:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalDsl.g:2275:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalDsl.g:2282:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2286:1: ( ( 'as' ) )
            // InternalDsl.g:2287:1: ( 'as' )
            {
            // InternalDsl.g:2287:1: ( 'as' )
            // InternalDsl.g:2288:2: 'as'
            {
             before(grammarAccess.getFunctionAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalDsl.g:2297:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2301:1: ( rule__Function__Group__3__Impl )
            // InternalDsl.g:2302:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalDsl.g:2308:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2312:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalDsl.g:2313:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalDsl.g:2313:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalDsl.g:2314:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalDsl.g:2315:2: ( rule__Function__IdAssignment_3 )
            // InternalDsl.g:2315:3: rule__Function__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalDsl.g:2324:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2328:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalDsl.g:2329:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalDsl.g:2336:1: rule__Activity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2340:1: ( ( 'activity' ) )
            // InternalDsl.g:2341:1: ( 'activity' )
            {
            // InternalDsl.g:2341:1: ( 'activity' )
            // InternalDsl.g:2342:2: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalDsl.g:2351:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2355:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalDsl.g:2356:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalDsl.g:2363:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2367:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // InternalDsl.g:2368:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // InternalDsl.g:2368:1: ( ( rule__Activity__NameAssignment_1 ) )
            // InternalDsl.g:2369:2: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // InternalDsl.g:2370:2: ( rule__Activity__NameAssignment_1 )
            // InternalDsl.g:2370:3: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // InternalDsl.g:2378:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2382:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalDsl.g:2383:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // InternalDsl.g:2390:1: rule__Activity__Group__2__Impl : ( 'as' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2394:1: ( ( 'as' ) )
            // InternalDsl.g:2395:1: ( 'as' )
            {
            // InternalDsl.g:2395:1: ( 'as' )
            // InternalDsl.g:2396:2: 'as'
            {
             before(grammarAccess.getActivityAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // InternalDsl.g:2405:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2409:1: ( rule__Activity__Group__3__Impl )
            // InternalDsl.g:2410:2: rule__Activity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // InternalDsl.g:2416:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__IdAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2420:1: ( ( ( rule__Activity__IdAssignment_3 ) ) )
            // InternalDsl.g:2421:1: ( ( rule__Activity__IdAssignment_3 ) )
            {
            // InternalDsl.g:2421:1: ( ( rule__Activity__IdAssignment_3 ) )
            // InternalDsl.g:2422:2: ( rule__Activity__IdAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getIdAssignment_3()); 
            // InternalDsl.g:2423:2: ( rule__Activity__IdAssignment_3 )
            // InternalDsl.g:2423:3: rule__Activity__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Activity__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDsl.g:2432:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2436:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDsl.g:2437:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDsl.g:2444:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2448:1: ( ( 'entity' ) )
            // InternalDsl.g:2449:1: ( 'entity' )
            {
            // InternalDsl.g:2449:1: ( 'entity' )
            // InternalDsl.g:2450:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDsl.g:2459:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2463:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDsl.g:2464:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDsl.g:2471:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2475:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDsl.g:2476:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDsl.g:2476:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDsl.g:2477:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDsl.g:2478:2: ( rule__Entity__NameAssignment_1 )
            // InternalDsl.g:2478:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDsl.g:2486:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2490:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDsl.g:2491:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDsl.g:2498:1: rule__Entity__Group__2__Impl : ( 'as' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2502:1: ( ( 'as' ) )
            // InternalDsl.g:2503:1: ( 'as' )
            {
            // InternalDsl.g:2503:1: ( 'as' )
            // InternalDsl.g:2504:2: 'as'
            {
             before(grammarAccess.getEntityAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDsl.g:2513:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2517:1: ( rule__Entity__Group__3__Impl )
            // InternalDsl.g:2518:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDsl.g:2524:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__IdAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2528:1: ( ( ( rule__Entity__IdAssignment_3 ) ) )
            // InternalDsl.g:2529:1: ( ( rule__Entity__IdAssignment_3 ) )
            {
            // InternalDsl.g:2529:1: ( ( rule__Entity__IdAssignment_3 ) )
            // InternalDsl.g:2530:2: ( rule__Entity__IdAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getIdAssignment_3()); 
            // InternalDsl.g:2531:2: ( rule__Entity__IdAssignment_3 )
            // InternalDsl.g:2531:3: rule__Entity__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalDsl.g:2540:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2544:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalDsl.g:2545:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalDsl.g:2552:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2556:1: ( ( 'role' ) )
            // InternalDsl.g:2557:1: ( 'role' )
            {
            // InternalDsl.g:2557:1: ( 'role' )
            // InternalDsl.g:2558:2: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalDsl.g:2567:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2571:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalDsl.g:2572:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalDsl.g:2579:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2583:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // InternalDsl.g:2584:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // InternalDsl.g:2584:1: ( ( rule__Role__NameAssignment_1 ) )
            // InternalDsl.g:2585:2: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // InternalDsl.g:2586:2: ( rule__Role__NameAssignment_1 )
            // InternalDsl.g:2586:3: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalDsl.g:2594:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2598:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalDsl.g:2599:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalDsl.g:2606:1: rule__Role__Group__2__Impl : ( 'as' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2610:1: ( ( 'as' ) )
            // InternalDsl.g:2611:1: ( 'as' )
            {
            // InternalDsl.g:2611:1: ( 'as' )
            // InternalDsl.g:2612:2: 'as'
            {
             before(grammarAccess.getRoleAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalDsl.g:2621:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2625:1: ( rule__Role__Group__3__Impl )
            // InternalDsl.g:2626:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalDsl.g:2632:1: rule__Role__Group__3__Impl : ( ( rule__Role__IdAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2636:1: ( ( ( rule__Role__IdAssignment_3 ) ) )
            // InternalDsl.g:2637:1: ( ( rule__Role__IdAssignment_3 ) )
            {
            // InternalDsl.g:2637:1: ( ( rule__Role__IdAssignment_3 ) )
            // InternalDsl.g:2638:2: ( rule__Role__IdAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getIdAssignment_3()); 
            // InternalDsl.g:2639:2: ( rule__Role__IdAssignment_3 )
            // InternalDsl.g:2639:3: rule__Role__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Role__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__SequenceMessageType__Group__0"
    // InternalDsl.g:2648:1: rule__SequenceMessageType__Group__0 : rule__SequenceMessageType__Group__0__Impl rule__SequenceMessageType__Group__1 ;
    public final void rule__SequenceMessageType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2652:1: ( rule__SequenceMessageType__Group__0__Impl rule__SequenceMessageType__Group__1 )
            // InternalDsl.g:2653:2: rule__SequenceMessageType__Group__0__Impl rule__SequenceMessageType__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__SequenceMessageType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessageType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessageType__Group__0"


    // $ANTLR start "rule__SequenceMessageType__Group__0__Impl"
    // InternalDsl.g:2660:1: rule__SequenceMessageType__Group__0__Impl : ( ( rule__SequenceMessageType__Alternatives_0 ) ) ;
    public final void rule__SequenceMessageType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2664:1: ( ( ( rule__SequenceMessageType__Alternatives_0 ) ) )
            // InternalDsl.g:2665:1: ( ( rule__SequenceMessageType__Alternatives_0 ) )
            {
            // InternalDsl.g:2665:1: ( ( rule__SequenceMessageType__Alternatives_0 ) )
            // InternalDsl.g:2666:2: ( rule__SequenceMessageType__Alternatives_0 )
            {
             before(grammarAccess.getSequenceMessageTypeAccess().getAlternatives_0()); 
            // InternalDsl.g:2667:2: ( rule__SequenceMessageType__Alternatives_0 )
            // InternalDsl.g:2667:3: rule__SequenceMessageType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessageType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessageType__Group__0__Impl"


    // $ANTLR start "rule__SequenceMessageType__Group__1"
    // InternalDsl.g:2675:1: rule__SequenceMessageType__Group__1 : rule__SequenceMessageType__Group__1__Impl ;
    public final void rule__SequenceMessageType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2679:1: ( rule__SequenceMessageType__Group__1__Impl )
            // InternalDsl.g:2680:2: rule__SequenceMessageType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessageType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessageType__Group__1"


    // $ANTLR start "rule__SequenceMessageType__Group__1__Impl"
    // InternalDsl.g:2686:1: rule__SequenceMessageType__Group__1__Impl : ( ( rule__SequenceMessageType__ReturnAssignment_1 )? ) ;
    public final void rule__SequenceMessageType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2690:1: ( ( ( rule__SequenceMessageType__ReturnAssignment_1 )? ) )
            // InternalDsl.g:2691:1: ( ( rule__SequenceMessageType__ReturnAssignment_1 )? )
            {
            // InternalDsl.g:2691:1: ( ( rule__SequenceMessageType__ReturnAssignment_1 )? )
            // InternalDsl.g:2692:2: ( rule__SequenceMessageType__ReturnAssignment_1 )?
            {
             before(grammarAccess.getSequenceMessageTypeAccess().getReturnAssignment_1()); 
            // InternalDsl.g:2693:2: ( rule__SequenceMessageType__ReturnAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==38) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2693:3: rule__SequenceMessageType__ReturnAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceMessageType__ReturnAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceMessageTypeAccess().getReturnAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessageType__Group__1__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__0"
    // InternalDsl.g:2702:1: rule__SequenceMessage__Group__0 : rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1 ;
    public final void rule__SequenceMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2706:1: ( rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1 )
            // InternalDsl.g:2707:2: rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__SequenceMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__0"


    // $ANTLR start "rule__SequenceMessage__Group__0__Impl"
    // InternalDsl.g:2714:1: rule__SequenceMessage__Group__0__Impl : ( ( rule__SequenceMessage__SourceAssignment_0 ) ) ;
    public final void rule__SequenceMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2718:1: ( ( ( rule__SequenceMessage__SourceAssignment_0 ) ) )
            // InternalDsl.g:2719:1: ( ( rule__SequenceMessage__SourceAssignment_0 ) )
            {
            // InternalDsl.g:2719:1: ( ( rule__SequenceMessage__SourceAssignment_0 ) )
            // InternalDsl.g:2720:2: ( rule__SequenceMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getSequenceMessageAccess().getSourceAssignment_0()); 
            // InternalDsl.g:2721:2: ( rule__SequenceMessage__SourceAssignment_0 )
            // InternalDsl.g:2721:3: rule__SequenceMessage__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__0__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__1"
    // InternalDsl.g:2729:1: rule__SequenceMessage__Group__1 : rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2 ;
    public final void rule__SequenceMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2733:1: ( rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2 )
            // InternalDsl.g:2734:2: rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SequenceMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__1"


    // $ANTLR start "rule__SequenceMessage__Group__1__Impl"
    // InternalDsl.g:2741:1: rule__SequenceMessage__Group__1__Impl : ( '->' ) ;
    public final void rule__SequenceMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2745:1: ( ( '->' ) )
            // InternalDsl.g:2746:1: ( '->' )
            {
            // InternalDsl.g:2746:1: ( '->' )
            // InternalDsl.g:2747:2: '->'
            {
             before(grammarAccess.getSequenceMessageAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__1__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__2"
    // InternalDsl.g:2756:1: rule__SequenceMessage__Group__2 : rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3 ;
    public final void rule__SequenceMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2760:1: ( rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3 )
            // InternalDsl.g:2761:2: rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__SequenceMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__2"


    // $ANTLR start "rule__SequenceMessage__Group__2__Impl"
    // InternalDsl.g:2768:1: rule__SequenceMessage__Group__2__Impl : ( ( rule__SequenceMessage__TargetAssignment_2 ) ) ;
    public final void rule__SequenceMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2772:1: ( ( ( rule__SequenceMessage__TargetAssignment_2 ) ) )
            // InternalDsl.g:2773:1: ( ( rule__SequenceMessage__TargetAssignment_2 ) )
            {
            // InternalDsl.g:2773:1: ( ( rule__SequenceMessage__TargetAssignment_2 ) )
            // InternalDsl.g:2774:2: ( rule__SequenceMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getSequenceMessageAccess().getTargetAssignment_2()); 
            // InternalDsl.g:2775:2: ( rule__SequenceMessage__TargetAssignment_2 )
            // InternalDsl.g:2775:3: rule__SequenceMessage__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__2__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__3"
    // InternalDsl.g:2783:1: rule__SequenceMessage__Group__3 : rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4 ;
    public final void rule__SequenceMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2787:1: ( rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4 )
            // InternalDsl.g:2788:2: rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SequenceMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__3"


    // $ANTLR start "rule__SequenceMessage__Group__3__Impl"
    // InternalDsl.g:2795:1: rule__SequenceMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__SequenceMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2799:1: ( ( ':' ) )
            // InternalDsl.g:2800:1: ( ':' )
            {
            // InternalDsl.g:2800:1: ( ':' )
            // InternalDsl.g:2801:2: ':'
            {
             before(grammarAccess.getSequenceMessageAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__3__Impl"


    // $ANTLR start "rule__SequenceMessage__Group__4"
    // InternalDsl.g:2810:1: rule__SequenceMessage__Group__4 : rule__SequenceMessage__Group__4__Impl ;
    public final void rule__SequenceMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2814:1: ( rule__SequenceMessage__Group__4__Impl )
            // InternalDsl.g:2815:2: rule__SequenceMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__4"


    // $ANTLR start "rule__SequenceMessage__Group__4__Impl"
    // InternalDsl.g:2821:1: rule__SequenceMessage__Group__4__Impl : ( ( rule__SequenceMessage__NameAssignment_4 ) ) ;
    public final void rule__SequenceMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2825:1: ( ( ( rule__SequenceMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:2826:1: ( ( rule__SequenceMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:2826:1: ( ( rule__SequenceMessage__NameAssignment_4 ) )
            // InternalDsl.g:2827:2: ( rule__SequenceMessage__NameAssignment_4 )
            {
             before(grammarAccess.getSequenceMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:2828:2: ( rule__SequenceMessage__NameAssignment_4 )
            // InternalDsl.g:2828:3: rule__SequenceMessage__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SequenceMessage__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSequenceMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__Group__4__Impl"


    // $ANTLR start "rule__CreateMessage__Group__0"
    // InternalDsl.g:2837:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2841:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalDsl.g:2842:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CreateMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__0"


    // $ANTLR start "rule__CreateMessage__Group__0__Impl"
    // InternalDsl.g:2849:1: rule__CreateMessage__Group__0__Impl : ( ( rule__CreateMessage__SourceAssignment_0 ) ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2853:1: ( ( ( rule__CreateMessage__SourceAssignment_0 ) ) )
            // InternalDsl.g:2854:1: ( ( rule__CreateMessage__SourceAssignment_0 ) )
            {
            // InternalDsl.g:2854:1: ( ( rule__CreateMessage__SourceAssignment_0 ) )
            // InternalDsl.g:2855:2: ( rule__CreateMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getCreateMessageAccess().getSourceAssignment_0()); 
            // InternalDsl.g:2856:2: ( rule__CreateMessage__SourceAssignment_0 )
            // InternalDsl.g:2856:3: rule__CreateMessage__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__0__Impl"


    // $ANTLR start "rule__CreateMessage__Group__1"
    // InternalDsl.g:2864:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2868:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalDsl.g:2869:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__CreateMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__1"


    // $ANTLR start "rule__CreateMessage__Group__1__Impl"
    // InternalDsl.g:2876:1: rule__CreateMessage__Group__1__Impl : ( '->+' ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2880:1: ( ( '->+' ) )
            // InternalDsl.g:2881:1: ( '->+' )
            {
            // InternalDsl.g:2881:1: ( '->+' )
            // InternalDsl.g:2882:2: '->+'
            {
             before(grammarAccess.getCreateMessageAccess().getHyphenMinusGreaterThanSignPlusSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getHyphenMinusGreaterThanSignPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__1__Impl"


    // $ANTLR start "rule__CreateMessage__Group__2"
    // InternalDsl.g:2891:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2895:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalDsl.g:2896:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__CreateMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__2"


    // $ANTLR start "rule__CreateMessage__Group__2__Impl"
    // InternalDsl.g:2903:1: rule__CreateMessage__Group__2__Impl : ( ( rule__CreateMessage__TargetAssignment_2 ) ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2907:1: ( ( ( rule__CreateMessage__TargetAssignment_2 ) ) )
            // InternalDsl.g:2908:1: ( ( rule__CreateMessage__TargetAssignment_2 ) )
            {
            // InternalDsl.g:2908:1: ( ( rule__CreateMessage__TargetAssignment_2 ) )
            // InternalDsl.g:2909:2: ( rule__CreateMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getCreateMessageAccess().getTargetAssignment_2()); 
            // InternalDsl.g:2910:2: ( rule__CreateMessage__TargetAssignment_2 )
            // InternalDsl.g:2910:3: rule__CreateMessage__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__2__Impl"


    // $ANTLR start "rule__CreateMessage__Group__3"
    // InternalDsl.g:2918:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2922:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalDsl.g:2923:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CreateMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__3"


    // $ANTLR start "rule__CreateMessage__Group__3__Impl"
    // InternalDsl.g:2930:1: rule__CreateMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2934:1: ( ( ':' ) )
            // InternalDsl.g:2935:1: ( ':' )
            {
            // InternalDsl.g:2935:1: ( ':' )
            // InternalDsl.g:2936:2: ':'
            {
             before(grammarAccess.getCreateMessageAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__3__Impl"


    // $ANTLR start "rule__CreateMessage__Group__4"
    // InternalDsl.g:2945:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2949:1: ( rule__CreateMessage__Group__4__Impl )
            // InternalDsl.g:2950:2: rule__CreateMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__4"


    // $ANTLR start "rule__CreateMessage__Group__4__Impl"
    // InternalDsl.g:2956:1: rule__CreateMessage__Group__4__Impl : ( ( rule__CreateMessage__NameAssignment_4 ) ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2960:1: ( ( ( rule__CreateMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:2961:1: ( ( rule__CreateMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:2961:1: ( ( rule__CreateMessage__NameAssignment_4 ) )
            // InternalDsl.g:2962:2: ( rule__CreateMessage__NameAssignment_4 )
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:2963:2: ( rule__CreateMessage__NameAssignment_4 )
            // InternalDsl.g:2963:3: rule__CreateMessage__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__4__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__0"
    // InternalDsl.g:2972:1: rule__DeleteMessage__Group__0 : rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 ;
    public final void rule__DeleteMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2976:1: ( rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 )
            // InternalDsl.g:2977:2: rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__DeleteMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__0"


    // $ANTLR start "rule__DeleteMessage__Group__0__Impl"
    // InternalDsl.g:2984:1: rule__DeleteMessage__Group__0__Impl : ( ( rule__DeleteMessage__SourceAssignment_0 ) ) ;
    public final void rule__DeleteMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2988:1: ( ( ( rule__DeleteMessage__SourceAssignment_0 ) ) )
            // InternalDsl.g:2989:1: ( ( rule__DeleteMessage__SourceAssignment_0 ) )
            {
            // InternalDsl.g:2989:1: ( ( rule__DeleteMessage__SourceAssignment_0 ) )
            // InternalDsl.g:2990:2: ( rule__DeleteMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getDeleteMessageAccess().getSourceAssignment_0()); 
            // InternalDsl.g:2991:2: ( rule__DeleteMessage__SourceAssignment_0 )
            // InternalDsl.g:2991:3: rule__DeleteMessage__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__1"
    // InternalDsl.g:2999:1: rule__DeleteMessage__Group__1 : rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 ;
    public final void rule__DeleteMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3003:1: ( rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 )
            // InternalDsl.g:3004:2: rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__DeleteMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__1"


    // $ANTLR start "rule__DeleteMessage__Group__1__Impl"
    // InternalDsl.g:3011:1: rule__DeleteMessage__Group__1__Impl : ( '->x' ) ;
    public final void rule__DeleteMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3015:1: ( ( '->x' ) )
            // InternalDsl.g:3016:1: ( '->x' )
            {
            // InternalDsl.g:3016:1: ( '->x' )
            // InternalDsl.g:3017:2: '->x'
            {
             before(grammarAccess.getDeleteMessageAccess().getXKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__1__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__2"
    // InternalDsl.g:3026:1: rule__DeleteMessage__Group__2 : rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 ;
    public final void rule__DeleteMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3030:1: ( rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 )
            // InternalDsl.g:3031:2: rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__DeleteMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__2"


    // $ANTLR start "rule__DeleteMessage__Group__2__Impl"
    // InternalDsl.g:3038:1: rule__DeleteMessage__Group__2__Impl : ( ( rule__DeleteMessage__TargetAssignment_2 ) ) ;
    public final void rule__DeleteMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3042:1: ( ( ( rule__DeleteMessage__TargetAssignment_2 ) ) )
            // InternalDsl.g:3043:1: ( ( rule__DeleteMessage__TargetAssignment_2 ) )
            {
            // InternalDsl.g:3043:1: ( ( rule__DeleteMessage__TargetAssignment_2 ) )
            // InternalDsl.g:3044:2: ( rule__DeleteMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getDeleteMessageAccess().getTargetAssignment_2()); 
            // InternalDsl.g:3045:2: ( rule__DeleteMessage__TargetAssignment_2 )
            // InternalDsl.g:3045:3: rule__DeleteMessage__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__2__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__3"
    // InternalDsl.g:3053:1: rule__DeleteMessage__Group__3 : rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4 ;
    public final void rule__DeleteMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3057:1: ( rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4 )
            // InternalDsl.g:3058:2: rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DeleteMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__3"


    // $ANTLR start "rule__DeleteMessage__Group__3__Impl"
    // InternalDsl.g:3065:1: rule__DeleteMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__DeleteMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3069:1: ( ( ':' ) )
            // InternalDsl.g:3070:1: ( ':' )
            {
            // InternalDsl.g:3070:1: ( ':' )
            // InternalDsl.g:3071:2: ':'
            {
             before(grammarAccess.getDeleteMessageAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__3__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__4"
    // InternalDsl.g:3080:1: rule__DeleteMessage__Group__4 : rule__DeleteMessage__Group__4__Impl ;
    public final void rule__DeleteMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3084:1: ( rule__DeleteMessage__Group__4__Impl )
            // InternalDsl.g:3085:2: rule__DeleteMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__4"


    // $ANTLR start "rule__DeleteMessage__Group__4__Impl"
    // InternalDsl.g:3091:1: rule__DeleteMessage__Group__4__Impl : ( ( rule__DeleteMessage__NameAssignment_4 ) ) ;
    public final void rule__DeleteMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3095:1: ( ( ( rule__DeleteMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:3096:1: ( ( rule__DeleteMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:3096:1: ( ( rule__DeleteMessage__NameAssignment_4 ) )
            // InternalDsl.g:3097:2: ( rule__DeleteMessage__NameAssignment_4 )
            {
             before(grammarAccess.getDeleteMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:3098:2: ( rule__DeleteMessage__NameAssignment_4 )
            // InternalDsl.g:3098:3: rule__DeleteMessage__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMessage__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__4__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__0"
    // InternalDsl.g:3107:1: rule__ReturnMessage__Group__0 : rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 ;
    public final void rule__ReturnMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3111:1: ( rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 )
            // InternalDsl.g:3112:2: rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ReturnMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__0"


    // $ANTLR start "rule__ReturnMessage__Group__0__Impl"
    // InternalDsl.g:3119:1: rule__ReturnMessage__Group__0__Impl : ( ( rule__ReturnMessage__TargetAssignment_0 ) ) ;
    public final void rule__ReturnMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3123:1: ( ( ( rule__ReturnMessage__TargetAssignment_0 ) ) )
            // InternalDsl.g:3124:1: ( ( rule__ReturnMessage__TargetAssignment_0 ) )
            {
            // InternalDsl.g:3124:1: ( ( rule__ReturnMessage__TargetAssignment_0 ) )
            // InternalDsl.g:3125:2: ( rule__ReturnMessage__TargetAssignment_0 )
            {
             before(grammarAccess.getReturnMessageAccess().getTargetAssignment_0()); 
            // InternalDsl.g:3126:2: ( rule__ReturnMessage__TargetAssignment_0 )
            // InternalDsl.g:3126:3: rule__ReturnMessage__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnMessage__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReturnMessageAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__0__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__1"
    // InternalDsl.g:3134:1: rule__ReturnMessage__Group__1 : rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 ;
    public final void rule__ReturnMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3138:1: ( rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 )
            // InternalDsl.g:3139:2: rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ReturnMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__1"


    // $ANTLR start "rule__ReturnMessage__Group__1__Impl"
    // InternalDsl.g:3146:1: rule__ReturnMessage__Group__1__Impl : ( '<--' ) ;
    public final void rule__ReturnMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3150:1: ( ( '<--' ) )
            // InternalDsl.g:3151:1: ( '<--' )
            {
            // InternalDsl.g:3151:1: ( '<--' )
            // InternalDsl.g:3152:2: '<--'
            {
             before(grammarAccess.getReturnMessageAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReturnMessageAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__1__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__2"
    // InternalDsl.g:3161:1: rule__ReturnMessage__Group__2 : rule__ReturnMessage__Group__2__Impl rule__ReturnMessage__Group__3 ;
    public final void rule__ReturnMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3165:1: ( rule__ReturnMessage__Group__2__Impl rule__ReturnMessage__Group__3 )
            // InternalDsl.g:3166:2: rule__ReturnMessage__Group__2__Impl rule__ReturnMessage__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ReturnMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__2"


    // $ANTLR start "rule__ReturnMessage__Group__2__Impl"
    // InternalDsl.g:3173:1: rule__ReturnMessage__Group__2__Impl : ( ( rule__ReturnMessage__SourceAssignment_2 ) ) ;
    public final void rule__ReturnMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3177:1: ( ( ( rule__ReturnMessage__SourceAssignment_2 ) ) )
            // InternalDsl.g:3178:1: ( ( rule__ReturnMessage__SourceAssignment_2 ) )
            {
            // InternalDsl.g:3178:1: ( ( rule__ReturnMessage__SourceAssignment_2 ) )
            // InternalDsl.g:3179:2: ( rule__ReturnMessage__SourceAssignment_2 )
            {
             before(grammarAccess.getReturnMessageAccess().getSourceAssignment_2()); 
            // InternalDsl.g:3180:2: ( rule__ReturnMessage__SourceAssignment_2 )
            // InternalDsl.g:3180:3: rule__ReturnMessage__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnMessage__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnMessageAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__2__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__3"
    // InternalDsl.g:3188:1: rule__ReturnMessage__Group__3 : rule__ReturnMessage__Group__3__Impl rule__ReturnMessage__Group__4 ;
    public final void rule__ReturnMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3192:1: ( rule__ReturnMessage__Group__3__Impl rule__ReturnMessage__Group__4 )
            // InternalDsl.g:3193:2: rule__ReturnMessage__Group__3__Impl rule__ReturnMessage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ReturnMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__3"


    // $ANTLR start "rule__ReturnMessage__Group__3__Impl"
    // InternalDsl.g:3200:1: rule__ReturnMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__ReturnMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3204:1: ( ( ':' ) )
            // InternalDsl.g:3205:1: ( ':' )
            {
            // InternalDsl.g:3205:1: ( ':' )
            // InternalDsl.g:3206:2: ':'
            {
             before(grammarAccess.getReturnMessageAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReturnMessageAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__3__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__4"
    // InternalDsl.g:3215:1: rule__ReturnMessage__Group__4 : rule__ReturnMessage__Group__4__Impl ;
    public final void rule__ReturnMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3219:1: ( rule__ReturnMessage__Group__4__Impl )
            // InternalDsl.g:3220:2: rule__ReturnMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnMessage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__4"


    // $ANTLR start "rule__ReturnMessage__Group__4__Impl"
    // InternalDsl.g:3226:1: rule__ReturnMessage__Group__4__Impl : ( ( rule__ReturnMessage__NameAssignment_4 ) ) ;
    public final void rule__ReturnMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3230:1: ( ( ( rule__ReturnMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:3231:1: ( ( rule__ReturnMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:3231:1: ( ( rule__ReturnMessage__NameAssignment_4 ) )
            // InternalDsl.g:3232:2: ( rule__ReturnMessage__NameAssignment_4 )
            {
             before(grammarAccess.getReturnMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:3233:2: ( rule__ReturnMessage__NameAssignment_4 )
            // InternalDsl.g:3233:3: rule__ReturnMessage__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReturnMessage__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReturnMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__Group__4__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__0"
    // InternalDsl.g:3242:1: rule__ArmTimerMessage__Group__0 : rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1 ;
    public final void rule__ArmTimerMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3246:1: ( rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1 )
            // InternalDsl.g:3247:2: rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ArmTimerMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__0"


    // $ANTLR start "rule__ArmTimerMessage__Group__0__Impl"
    // InternalDsl.g:3254:1: rule__ArmTimerMessage__Group__0__Impl : ( '->>' ) ;
    public final void rule__ArmTimerMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3258:1: ( ( '->>' ) )
            // InternalDsl.g:3259:1: ( '->>' )
            {
            // InternalDsl.g:3259:1: ( '->>' )
            // InternalDsl.g:3260:2: '->>'
            {
             before(grammarAccess.getArmTimerMessageAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__0__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__1"
    // InternalDsl.g:3269:1: rule__ArmTimerMessage__Group__1 : rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2 ;
    public final void rule__ArmTimerMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3273:1: ( rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2 )
            // InternalDsl.g:3274:2: rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ArmTimerMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__1"


    // $ANTLR start "rule__ArmTimerMessage__Group__1__Impl"
    // InternalDsl.g:3281:1: rule__ArmTimerMessage__Group__1__Impl : ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) ) ;
    public final void rule__ArmTimerMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3285:1: ( ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) ) )
            // InternalDsl.g:3286:1: ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) )
            {
            // InternalDsl.g:3286:1: ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) )
            // InternalDsl.g:3287:2: ( rule__ArmTimerMessage__ParticipantAssignment_1 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getParticipantAssignment_1()); 
            // InternalDsl.g:3288:2: ( rule__ArmTimerMessage__ParticipantAssignment_1 )
            // InternalDsl.g:3288:3: rule__ArmTimerMessage__ParticipantAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__ParticipantAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArmTimerMessageAccess().getParticipantAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__1__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__2"
    // InternalDsl.g:3296:1: rule__ArmTimerMessage__Group__2 : rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3 ;
    public final void rule__ArmTimerMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3300:1: ( rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3 )
            // InternalDsl.g:3301:2: rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ArmTimerMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__2"


    // $ANTLR start "rule__ArmTimerMessage__Group__2__Impl"
    // InternalDsl.g:3308:1: rule__ArmTimerMessage__Group__2__Impl : ( ':' ) ;
    public final void rule__ArmTimerMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3312:1: ( ( ':' ) )
            // InternalDsl.g:3313:1: ( ':' )
            {
            // InternalDsl.g:3313:1: ( ':' )
            // InternalDsl.g:3314:2: ':'
            {
             before(grammarAccess.getArmTimerMessageAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__2__Impl"


    // $ANTLR start "rule__ArmTimerMessage__Group__3"
    // InternalDsl.g:3323:1: rule__ArmTimerMessage__Group__3 : rule__ArmTimerMessage__Group__3__Impl ;
    public final void rule__ArmTimerMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3327:1: ( rule__ArmTimerMessage__Group__3__Impl )
            // InternalDsl.g:3328:2: rule__ArmTimerMessage__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__3"


    // $ANTLR start "rule__ArmTimerMessage__Group__3__Impl"
    // InternalDsl.g:3334:1: rule__ArmTimerMessage__Group__3__Impl : ( ( rule__ArmTimerMessage__NameAssignment_3 ) ) ;
    public final void rule__ArmTimerMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3338:1: ( ( ( rule__ArmTimerMessage__NameAssignment_3 ) ) )
            // InternalDsl.g:3339:1: ( ( rule__ArmTimerMessage__NameAssignment_3 ) )
            {
            // InternalDsl.g:3339:1: ( ( rule__ArmTimerMessage__NameAssignment_3 ) )
            // InternalDsl.g:3340:2: ( rule__ArmTimerMessage__NameAssignment_3 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getNameAssignment_3()); 
            // InternalDsl.g:3341:2: ( rule__ArmTimerMessage__NameAssignment_3 )
            // InternalDsl.g:3341:3: rule__ArmTimerMessage__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArmTimerMessage__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArmTimerMessageAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__Group__3__Impl"


    // $ANTLR start "rule__ParticipantDeactivation__Group__0"
    // InternalDsl.g:3350:1: rule__ParticipantDeactivation__Group__0 : rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1 ;
    public final void rule__ParticipantDeactivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3354:1: ( rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1 )
            // InternalDsl.g:3355:2: rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ParticipantDeactivation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__0"


    // $ANTLR start "rule__ParticipantDeactivation__Group__0__Impl"
    // InternalDsl.g:3362:1: rule__ParticipantDeactivation__Group__0__Impl : ( 'deactivate' ) ;
    public final void rule__ParticipantDeactivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3366:1: ( ( 'deactivate' ) )
            // InternalDsl.g:3367:1: ( 'deactivate' )
            {
            // InternalDsl.g:3367:1: ( 'deactivate' )
            // InternalDsl.g:3368:2: 'deactivate'
            {
             before(grammarAccess.getParticipantDeactivationAccess().getDeactivateKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParticipantDeactivationAccess().getDeactivateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__0__Impl"


    // $ANTLR start "rule__ParticipantDeactivation__Group__1"
    // InternalDsl.g:3377:1: rule__ParticipantDeactivation__Group__1 : rule__ParticipantDeactivation__Group__1__Impl ;
    public final void rule__ParticipantDeactivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3381:1: ( rule__ParticipantDeactivation__Group__1__Impl )
            // InternalDsl.g:3382:2: rule__ParticipantDeactivation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__1"


    // $ANTLR start "rule__ParticipantDeactivation__Group__1__Impl"
    // InternalDsl.g:3388:1: rule__ParticipantDeactivation__Group__1__Impl : ( ( rule__ParticipantDeactivation__NameAssignment_1 ) ) ;
    public final void rule__ParticipantDeactivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3392:1: ( ( ( rule__ParticipantDeactivation__NameAssignment_1 ) ) )
            // InternalDsl.g:3393:1: ( ( rule__ParticipantDeactivation__NameAssignment_1 ) )
            {
            // InternalDsl.g:3393:1: ( ( rule__ParticipantDeactivation__NameAssignment_1 ) )
            // InternalDsl.g:3394:2: ( rule__ParticipantDeactivation__NameAssignment_1 )
            {
             before(grammarAccess.getParticipantDeactivationAccess().getNameAssignment_1()); 
            // InternalDsl.g:3395:2: ( rule__ParticipantDeactivation__NameAssignment_1 )
            // InternalDsl.g:3395:3: rule__ParticipantDeactivation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantDeactivation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDeactivationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalDsl.g:3404:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3408:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDsl.g:3409:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalDsl.g:3416:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3420:1: ( ( 'ref' ) )
            // InternalDsl.g:3421:1: ( 'ref' )
            {
            // InternalDsl.g:3421:1: ( 'ref' )
            // InternalDsl.g:3422:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalDsl.g:3431:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3435:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalDsl.g:3436:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalDsl.g:3443:1: rule__Reference__Group__1__Impl : ( 'over' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3447:1: ( ( 'over' ) )
            // InternalDsl.g:3448:1: ( 'over' )
            {
            // InternalDsl.g:3448:1: ( 'over' )
            // InternalDsl.g:3449:2: 'over'
            {
             before(grammarAccess.getReferenceAccess().getOverKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getOverKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalDsl.g:3458:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3462:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalDsl.g:3463:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalDsl.g:3470:1: rule__Reference__Group__2__Impl : ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3474:1: ( ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) ) )
            // InternalDsl.g:3475:1: ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) )
            {
            // InternalDsl.g:3475:1: ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) )
            // InternalDsl.g:3476:2: ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* )
            {
            // InternalDsl.g:3476:2: ( ( rule__Reference__TimelinesAssignment_2 ) )
            // InternalDsl.g:3477:3: ( rule__Reference__TimelinesAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 
            // InternalDsl.g:3478:3: ( rule__Reference__TimelinesAssignment_2 )
            // InternalDsl.g:3478:4: rule__Reference__TimelinesAssignment_2
            {
            pushFollow(FOLLOW_32);
            rule__Reference__TimelinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 

            }

            // InternalDsl.g:3481:2: ( ( rule__Reference__TimelinesAssignment_2 )* )
            // InternalDsl.g:3482:3: ( rule__Reference__TimelinesAssignment_2 )*
            {
             before(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 
            // InternalDsl.g:3483:3: ( rule__Reference__TimelinesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:3483:4: rule__Reference__TimelinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Reference__TimelinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalDsl.g:3492:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3496:1: ( rule__Reference__Group__3__Impl )
            // InternalDsl.g:3497:2: rule__Reference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalDsl.g:3503:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__NameAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3507:1: ( ( ( rule__Reference__NameAssignment_3 ) ) )
            // InternalDsl.g:3508:1: ( ( rule__Reference__NameAssignment_3 ) )
            {
            // InternalDsl.g:3508:1: ( ( rule__Reference__NameAssignment_3 ) )
            // InternalDsl.g:3509:2: ( rule__Reference__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_3()); 
            // InternalDsl.g:3510:2: ( rule__Reference__NameAssignment_3 )
            // InternalDsl.g:3510:3: rule__Reference__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Model__ScenarioTypeAssignment_1"
    // InternalDsl.g:3519:1: rule__Model__ScenarioTypeAssignment_1 : ( ruleScenarioTypeAndParticipants ) ;
    public final void rule__Model__ScenarioTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3523:1: ( ( ruleScenarioTypeAndParticipants ) )
            // InternalDsl.g:3524:2: ( ruleScenarioTypeAndParticipants )
            {
            // InternalDsl.g:3524:2: ( ruleScenarioTypeAndParticipants )
            // InternalDsl.g:3525:3: ruleScenarioTypeAndParticipants
            {
             before(grammarAccess.getModelAccess().getScenarioTypeScenarioTypeAndParticipantsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScenarioTypeAndParticipants();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScenarioTypeScenarioTypeAndParticipantsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScenarioTypeAssignment_1"


    // $ANTLR start "rule__Model__MessagesOrReferencesAssignment_2"
    // InternalDsl.g:3534:1: rule__Model__MessagesOrReferencesAssignment_2 : ( ( rule__Model__MessagesOrReferencesAlternatives_2_0 ) ) ;
    public final void rule__Model__MessagesOrReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3538:1: ( ( ( rule__Model__MessagesOrReferencesAlternatives_2_0 ) ) )
            // InternalDsl.g:3539:2: ( ( rule__Model__MessagesOrReferencesAlternatives_2_0 ) )
            {
            // InternalDsl.g:3539:2: ( ( rule__Model__MessagesOrReferencesAlternatives_2_0 ) )
            // InternalDsl.g:3540:3: ( rule__Model__MessagesOrReferencesAlternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getMessagesOrReferencesAlternatives_2_0()); 
            // InternalDsl.g:3541:3: ( rule__Model__MessagesOrReferencesAlternatives_2_0 )
            // InternalDsl.g:3541:4: rule__Model__MessagesOrReferencesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__MessagesOrReferencesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMessagesOrReferencesAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MessagesOrReferencesAssignment_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_0_2"
    // InternalDsl.g:3549:1: rule__ScenarioTypeAndParticipants__NameAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3553:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3554:2: ( RULE_STRING )
            {
            // InternalDsl.g:3554:2: ( RULE_STRING )
            // InternalDsl.g:3555:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_0_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4"
    // InternalDsl.g:3564:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4 : ( ruleActor ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3568:1: ( ( ruleActor ) )
            // InternalDsl.g:3569:2: ( ruleActor )
            {
            // InternalDsl.g:3569:2: ( ruleActor )
            // InternalDsl.g:3570:3: ruleActor
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_1_2"
    // InternalDsl.g:3579:1: rule__ScenarioTypeAndParticipants__NameAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3583:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3584:2: ( RULE_STRING )
            {
            // InternalDsl.g:3584:2: ( RULE_STRING )
            // InternalDsl.g:3585:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_1_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4"
    // InternalDsl.g:3594:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4 : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3598:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0 ) ) )
            // InternalDsl.g:3599:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0 ) )
            {
            // InternalDsl.g:3599:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0 ) )
            // InternalDsl.g:3600:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_1_4_0()); 
            // InternalDsl.g:3601:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0 )
            // InternalDsl.g:3601:4: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_2_2"
    // InternalDsl.g:3609:1: rule__ScenarioTypeAndParticipants__NameAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3613:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3614:2: ( RULE_STRING )
            {
            // InternalDsl.g:3614:2: ( RULE_STRING )
            // InternalDsl.g:3615:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_2_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4"
    // InternalDsl.g:3624:1: rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4 : ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3628:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0 ) ) )
            // InternalDsl.g:3629:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0 ) )
            {
            // InternalDsl.g:3629:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0 ) )
            // InternalDsl.g:3630:3: ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAlternatives_2_4_0()); 
            // InternalDsl.g:3631:3: ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0 )
            // InternalDsl.g:3631:4: rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_4_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAlternatives_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_3_2"
    // InternalDsl.g:3639:1: rule__ScenarioTypeAndParticipants__NameAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3643:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3644:2: ( RULE_STRING )
            {
            // InternalDsl.g:3644:2: ( RULE_STRING )
            // InternalDsl.g:3645:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_3_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4"
    // InternalDsl.g:3654:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4 : ( ruleFunction ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3658:1: ( ( ruleFunction ) )
            // InternalDsl.g:3659:2: ( ruleFunction )
            {
            // InternalDsl.g:3659:2: ( ruleFunction )
            // InternalDsl.g:3660:3: ruleFunction
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsFunctionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsFunctionParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_4_2"
    // InternalDsl.g:3669:1: rule__ScenarioTypeAndParticipants__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3673:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3674:2: ( RULE_STRING )
            {
            // InternalDsl.g:3674:2: ( RULE_STRING )
            // InternalDsl.g:3675:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_4_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4"
    // InternalDsl.g:3684:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4 : ( ruleConfigurationItem ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3688:1: ( ( ruleConfigurationItem ) )
            // InternalDsl.g:3689:2: ( ruleConfigurationItem )
            {
            // InternalDsl.g:3689:2: ( ruleConfigurationItem )
            // InternalDsl.g:3690:3: ruleConfigurationItem
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsConfigurationItemParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigurationItem();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsConfigurationItemParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_4"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_5_1"
    // InternalDsl.g:3699:1: rule__ScenarioTypeAndParticipants__NameAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3703:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3704:2: ( RULE_STRING )
            {
            // InternalDsl.g:3704:2: ( RULE_STRING )
            // InternalDsl.g:3705:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_5_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3"
    // InternalDsl.g:3714:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3 : ( ruleActivity ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3718:1: ( ( ruleActivity ) )
            // InternalDsl.g:3719:2: ( ruleActivity )
            {
            // InternalDsl.g:3719:2: ( ruleActivity )
            // InternalDsl.g:3720:3: ruleActivity
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActivityParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActivityParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_6_1"
    // InternalDsl.g:3729:1: rule__ScenarioTypeAndParticipants__NameAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3733:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3734:2: ( RULE_STRING )
            {
            // InternalDsl.g:3734:2: ( RULE_STRING )
            // InternalDsl.g:3735:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_6_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3"
    // InternalDsl.g:3744:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3 : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3748:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0 ) ) )
            // InternalDsl.g:3749:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0 ) )
            {
            // InternalDsl.g:3749:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0 ) )
            // InternalDsl.g:3750:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_6_3_0()); 
            // InternalDsl.g:3751:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0 )
            // InternalDsl.g:3751:4: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_3_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_3"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalDsl.g:3759:1: rule__Actor__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3763:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3764:2: ( RULE_STRING )
            {
            // InternalDsl.g:3764:2: ( RULE_STRING )
            // InternalDsl.g:3765:3: RULE_STRING
            {
             before(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__IdAssignment_3"
    // InternalDsl.g:3774:1: rule__Actor__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Actor__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3778:1: ( ( RULE_ID ) )
            // InternalDsl.g:3779:2: ( RULE_ID )
            {
            // InternalDsl.g:3779:2: ( RULE_ID )
            // InternalDsl.g:3780:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__IdAssignment_3"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalDsl.g:3789:1: rule__Component__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3793:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3794:2: ( RULE_STRING )
            {
            // InternalDsl.g:3794:2: ( RULE_STRING )
            // InternalDsl.g:3795:3: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__IdAssignment_3"
    // InternalDsl.g:3804:1: rule__Component__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Component__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3808:1: ( ( RULE_ID ) )
            // InternalDsl.g:3809:2: ( RULE_ID )
            {
            // InternalDsl.g:3809:2: ( RULE_ID )
            // InternalDsl.g:3810:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__IdAssignment_3"


    // $ANTLR start "rule__PhysicalComponent__ComponentAssignment_0"
    // InternalDsl.g:3819:1: rule__PhysicalComponent__ComponentAssignment_0 : ( ruleComponent ) ;
    public final void rule__PhysicalComponent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3823:1: ( ( ruleComponent ) )
            // InternalDsl.g:3824:2: ( ruleComponent )
            {
            // InternalDsl.g:3824:2: ( ruleComponent )
            // InternalDsl.g:3825:3: ruleComponent
            {
             before(grammarAccess.getPhysicalComponentAccess().getComponentComponentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getPhysicalComponentAccess().getComponentComponentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__ComponentAssignment_0"


    // $ANTLR start "rule__ConfigurationItem__NameAssignment_1"
    // InternalDsl.g:3834:1: rule__ConfigurationItem__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConfigurationItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3838:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3839:2: ( RULE_STRING )
            {
            // InternalDsl.g:3839:2: ( RULE_STRING )
            // InternalDsl.g:3840:3: RULE_STRING
            {
             before(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__NameAssignment_1"


    // $ANTLR start "rule__ConfigurationItem__IdAssignment_3"
    // InternalDsl.g:3849:1: rule__ConfigurationItem__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__ConfigurationItem__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3853:1: ( ( RULE_ID ) )
            // InternalDsl.g:3854:2: ( RULE_ID )
            {
            // InternalDsl.g:3854:2: ( RULE_ID )
            // InternalDsl.g:3855:3: RULE_ID
            {
             before(grammarAccess.getConfigurationItemAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__IdAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalDsl.g:3864:1: rule__Function__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3868:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3869:2: ( RULE_STRING )
            {
            // InternalDsl.g:3869:2: ( RULE_STRING )
            // InternalDsl.g:3870:3: RULE_STRING
            {
             before(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__IdAssignment_3"
    // InternalDsl.g:3879:1: rule__Function__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3883:1: ( ( RULE_ID ) )
            // InternalDsl.g:3884:2: ( RULE_ID )
            {
            // InternalDsl.g:3884:2: ( RULE_ID )
            // InternalDsl.g:3885:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__IdAssignment_3"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // InternalDsl.g:3894:1: rule__Activity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3898:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3899:2: ( RULE_STRING )
            {
            // InternalDsl.g:3899:2: ( RULE_STRING )
            // InternalDsl.g:3900:3: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__IdAssignment_3"
    // InternalDsl.g:3909:1: rule__Activity__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Activity__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3913:1: ( ( RULE_ID ) )
            // InternalDsl.g:3914:2: ( RULE_ID )
            {
            // InternalDsl.g:3914:2: ( RULE_ID )
            // InternalDsl.g:3915:3: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__IdAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDsl.g:3924:1: rule__Entity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3928:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3929:2: ( RULE_STRING )
            {
            // InternalDsl.g:3929:2: ( RULE_STRING )
            // InternalDsl.g:3930:3: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__IdAssignment_3"
    // InternalDsl.g:3939:1: rule__Entity__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3943:1: ( ( RULE_ID ) )
            // InternalDsl.g:3944:2: ( RULE_ID )
            {
            // InternalDsl.g:3944:2: ( RULE_ID )
            // InternalDsl.g:3945:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IdAssignment_3"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // InternalDsl.g:3954:1: rule__Role__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3958:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3959:2: ( RULE_STRING )
            {
            // InternalDsl.g:3959:2: ( RULE_STRING )
            // InternalDsl.g:3960:3: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__IdAssignment_3"
    // InternalDsl.g:3969:1: rule__Role__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Role__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3973:1: ( ( RULE_ID ) )
            // InternalDsl.g:3974:2: ( RULE_ID )
            {
            // InternalDsl.g:3974:2: ( RULE_ID )
            // InternalDsl.g:3975:3: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__IdAssignment_3"


    // $ANTLR start "rule__SequenceMessageType__ReturnAssignment_1"
    // InternalDsl.g:3984:1: rule__SequenceMessageType__ReturnAssignment_1 : ( ruleReturnMessage ) ;
    public final void rule__SequenceMessageType__ReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3988:1: ( ( ruleReturnMessage ) )
            // InternalDsl.g:3989:2: ( ruleReturnMessage )
            {
            // InternalDsl.g:3989:2: ( ruleReturnMessage )
            // InternalDsl.g:3990:3: ruleReturnMessage
            {
             before(grammarAccess.getSequenceMessageTypeAccess().getReturnReturnMessageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnMessage();

            state._fsp--;

             after(grammarAccess.getSequenceMessageTypeAccess().getReturnReturnMessageParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessageType__ReturnAssignment_1"


    // $ANTLR start "rule__SequenceMessage__SourceAssignment_0"
    // InternalDsl.g:3999:1: rule__SequenceMessage__SourceAssignment_0 : ( RULE_ID ) ;
    public final void rule__SequenceMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4003:1: ( ( RULE_ID ) )
            // InternalDsl.g:4004:2: ( RULE_ID )
            {
            // InternalDsl.g:4004:2: ( RULE_ID )
            // InternalDsl.g:4005:3: RULE_ID
            {
             before(grammarAccess.getSequenceMessageAccess().getSourceIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getSourceIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__SourceAssignment_0"


    // $ANTLR start "rule__SequenceMessage__TargetAssignment_2"
    // InternalDsl.g:4014:1: rule__SequenceMessage__TargetAssignment_2 : ( RULE_ID ) ;
    public final void rule__SequenceMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4018:1: ( ( RULE_ID ) )
            // InternalDsl.g:4019:2: ( RULE_ID )
            {
            // InternalDsl.g:4019:2: ( RULE_ID )
            // InternalDsl.g:4020:3: RULE_ID
            {
             before(grammarAccess.getSequenceMessageAccess().getTargetIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getTargetIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__TargetAssignment_2"


    // $ANTLR start "rule__SequenceMessage__NameAssignment_4"
    // InternalDsl.g:4029:1: rule__SequenceMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SequenceMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4033:1: ( ( RULE_STRING ) )
            // InternalDsl.g:4034:2: ( RULE_STRING )
            {
            // InternalDsl.g:4034:2: ( RULE_STRING )
            // InternalDsl.g:4035:3: RULE_STRING
            {
             before(grammarAccess.getSequenceMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceMessage__NameAssignment_4"


    // $ANTLR start "rule__CreateMessage__SourceAssignment_0"
    // InternalDsl.g:4044:1: rule__CreateMessage__SourceAssignment_0 : ( RULE_ID ) ;
    public final void rule__CreateMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4048:1: ( ( RULE_ID ) )
            // InternalDsl.g:4049:2: ( RULE_ID )
            {
            // InternalDsl.g:4049:2: ( RULE_ID )
            // InternalDsl.g:4050:3: RULE_ID
            {
             before(grammarAccess.getCreateMessageAccess().getSourceIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getSourceIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__SourceAssignment_0"


    // $ANTLR start "rule__CreateMessage__TargetAssignment_2"
    // InternalDsl.g:4059:1: rule__CreateMessage__TargetAssignment_2 : ( RULE_ID ) ;
    public final void rule__CreateMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4063:1: ( ( RULE_ID ) )
            // InternalDsl.g:4064:2: ( RULE_ID )
            {
            // InternalDsl.g:4064:2: ( RULE_ID )
            // InternalDsl.g:4065:3: RULE_ID
            {
             before(grammarAccess.getCreateMessageAccess().getTargetIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getTargetIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__TargetAssignment_2"


    // $ANTLR start "rule__CreateMessage__NameAssignment_4"
    // InternalDsl.g:4074:1: rule__CreateMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4078:1: ( ( RULE_STRING ) )
            // InternalDsl.g:4079:2: ( RULE_STRING )
            {
            // InternalDsl.g:4079:2: ( RULE_STRING )
            // InternalDsl.g:4080:3: RULE_STRING
            {
             before(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__NameAssignment_4"


    // $ANTLR start "rule__DeleteMessage__SourceAssignment_0"
    // InternalDsl.g:4089:1: rule__DeleteMessage__SourceAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeleteMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4093:1: ( ( RULE_ID ) )
            // InternalDsl.g:4094:2: ( RULE_ID )
            {
            // InternalDsl.g:4094:2: ( RULE_ID )
            // InternalDsl.g:4095:3: RULE_ID
            {
             before(grammarAccess.getDeleteMessageAccess().getSourceIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getSourceIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__SourceAssignment_0"


    // $ANTLR start "rule__DeleteMessage__TargetAssignment_2"
    // InternalDsl.g:4104:1: rule__DeleteMessage__TargetAssignment_2 : ( RULE_ID ) ;
    public final void rule__DeleteMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4108:1: ( ( RULE_ID ) )
            // InternalDsl.g:4109:2: ( RULE_ID )
            {
            // InternalDsl.g:4109:2: ( RULE_ID )
            // InternalDsl.g:4110:3: RULE_ID
            {
             before(grammarAccess.getDeleteMessageAccess().getTargetIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getTargetIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__TargetAssignment_2"


    // $ANTLR start "rule__DeleteMessage__NameAssignment_4"
    // InternalDsl.g:4119:1: rule__DeleteMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__DeleteMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4123:1: ( ( RULE_STRING ) )
            // InternalDsl.g:4124:2: ( RULE_STRING )
            {
            // InternalDsl.g:4124:2: ( RULE_STRING )
            // InternalDsl.g:4125:3: RULE_STRING
            {
             before(grammarAccess.getDeleteMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__NameAssignment_4"


    // $ANTLR start "rule__ReturnMessage__TargetAssignment_0"
    // InternalDsl.g:4134:1: rule__ReturnMessage__TargetAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReturnMessage__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4138:1: ( ( RULE_ID ) )
            // InternalDsl.g:4139:2: ( RULE_ID )
            {
            // InternalDsl.g:4139:2: ( RULE_ID )
            // InternalDsl.g:4140:3: RULE_ID
            {
             before(grammarAccess.getReturnMessageAccess().getTargetIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReturnMessageAccess().getTargetIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__TargetAssignment_0"


    // $ANTLR start "rule__ReturnMessage__SourceAssignment_2"
    // InternalDsl.g:4149:1: rule__ReturnMessage__SourceAssignment_2 : ( RULE_ID ) ;
    public final void rule__ReturnMessage__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4153:1: ( ( RULE_ID ) )
            // InternalDsl.g:4154:2: ( RULE_ID )
            {
            // InternalDsl.g:4154:2: ( RULE_ID )
            // InternalDsl.g:4155:3: RULE_ID
            {
             before(grammarAccess.getReturnMessageAccess().getSourceIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReturnMessageAccess().getSourceIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__SourceAssignment_2"


    // $ANTLR start "rule__ReturnMessage__NameAssignment_4"
    // InternalDsl.g:4164:1: rule__ReturnMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ReturnMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4168:1: ( ( RULE_STRING ) )
            // InternalDsl.g:4169:2: ( RULE_STRING )
            {
            // InternalDsl.g:4169:2: ( RULE_STRING )
            // InternalDsl.g:4170:3: RULE_STRING
            {
             before(grammarAccess.getReturnMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReturnMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnMessage__NameAssignment_4"


    // $ANTLR start "rule__ArmTimerMessage__ParticipantAssignment_1"
    // InternalDsl.g:4179:1: rule__ArmTimerMessage__ParticipantAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArmTimerMessage__ParticipantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4183:1: ( ( RULE_ID ) )
            // InternalDsl.g:4184:2: ( RULE_ID )
            {
            // InternalDsl.g:4184:2: ( RULE_ID )
            // InternalDsl.g:4185:3: RULE_ID
            {
             before(grammarAccess.getArmTimerMessageAccess().getParticipantIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getParticipantIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__ParticipantAssignment_1"


    // $ANTLR start "rule__ArmTimerMessage__NameAssignment_3"
    // InternalDsl.g:4194:1: rule__ArmTimerMessage__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ArmTimerMessage__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4198:1: ( ( RULE_STRING ) )
            // InternalDsl.g:4199:2: ( RULE_STRING )
            {
            // InternalDsl.g:4199:2: ( RULE_STRING )
            // InternalDsl.g:4200:3: RULE_STRING
            {
             before(grammarAccess.getArmTimerMessageAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArmTimerMessage__NameAssignment_3"


    // $ANTLR start "rule__ParticipantDeactivation__NameAssignment_1"
    // InternalDsl.g:4209:1: rule__ParticipantDeactivation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParticipantDeactivation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4213:1: ( ( RULE_ID ) )
            // InternalDsl.g:4214:2: ( RULE_ID )
            {
            // InternalDsl.g:4214:2: ( RULE_ID )
            // InternalDsl.g:4215:3: RULE_ID
            {
             before(grammarAccess.getParticipantDeactivationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParticipantDeactivationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDeactivation__NameAssignment_1"


    // $ANTLR start "rule__Reference__TimelinesAssignment_2"
    // InternalDsl.g:4224:1: rule__Reference__TimelinesAssignment_2 : ( RULE_ID ) ;
    public final void rule__Reference__TimelinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4228:1: ( ( RULE_ID ) )
            // InternalDsl.g:4229:2: ( RULE_ID )
            {
            // InternalDsl.g:4229:2: ( RULE_ID )
            // InternalDsl.g:4230:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getTimelinesIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTimelinesIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TimelinesAssignment_2"


    // $ANTLR start "rule__Reference__NameAssignment_3"
    // InternalDsl.g:4239:1: rule__Reference__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Reference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4243:1: ( ( RULE_STRING ) )
            // InternalDsl.g:4244:2: ( RULE_STRING )
            {
            // InternalDsl.g:4244:2: ( RULE_STRING )
            // InternalDsl.g:4245:3: RULE_STRING
            {
             before(grammarAccess.getReferenceAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\15\3\13\7\uffff";
    static final String dfa_3s = "\1\31\3\26\7\uffff";
    static final String dfa_4s = "\4\uffff\1\5\1\6\1\7\1\4\1\1\1\2\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\7\uffff\1\4\1\5\1\6",
            "\2\10\11\uffff\1\7",
            "\2\11\11\uffff\1\7",
            "\2\12\11\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "548:1: rule__ScenarioTypeAndParticipants__Alternatives : ( ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000380E000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000038000100020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000038000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000304000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000304000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000022L});

}