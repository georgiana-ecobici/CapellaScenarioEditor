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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unset'", "'behavior'", "'node'", "'scenario'", "'actor'", "'component'", "'configuration_item'", "'function'", "'as'", "'activity'", "'entity'", "'->'", "':'", "'->+'", "'->x'", "'<--'", "'->>'", "'deactivate'", "'ref'", "'over'", "'{'", "'}'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__20=20;
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


    // $ANTLR start "entryRuleParticipant"
    // InternalDsl.g:78:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleParticipant EOF )
            // InternalDsl.g:80:1: ruleParticipant EOF
            {
             before(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getParticipantRule()); 
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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalDsl.g:87:1: ruleParticipant : ( ( rule__Participant__Alternatives ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Participant__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Participant__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Participant__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Participant__Alternatives )
            {
             before(grammarAccess.getParticipantAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Participant__Alternatives )
            // InternalDsl.g:94:4: rule__Participant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleGenericComponent"
    // InternalDsl.g:103:1: entryRuleGenericComponent : ruleGenericComponent EOF ;
    public final void entryRuleGenericComponent() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleGenericComponent EOF )
            // InternalDsl.g:105:1: ruleGenericComponent EOF
            {
             before(grammarAccess.getGenericComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleGenericComponent();

            state._fsp--;

             after(grammarAccess.getGenericComponentRule()); 
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
    // $ANTLR end "entryRuleGenericComponent"


    // $ANTLR start "ruleGenericComponent"
    // InternalDsl.g:112:1: ruleGenericComponent : ( ( rule__GenericComponent__Alternatives ) ) ;
    public final void ruleGenericComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__GenericComponent__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__GenericComponent__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__GenericComponent__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__GenericComponent__Alternatives )
            {
             before(grammarAccess.getGenericComponentAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__GenericComponent__Alternatives )
            // InternalDsl.g:119:4: rule__GenericComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenericComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericComponentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGenericComponent"


    // $ANTLR start "entryRuleGenericFunction"
    // InternalDsl.g:128:1: entryRuleGenericFunction : ruleGenericFunction EOF ;
    public final void entryRuleGenericFunction() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleGenericFunction EOF )
            // InternalDsl.g:130:1: ruleGenericFunction EOF
            {
             before(grammarAccess.getGenericFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleGenericFunction();

            state._fsp--;

             after(grammarAccess.getGenericFunctionRule()); 
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
    // $ANTLR end "entryRuleGenericFunction"


    // $ANTLR start "ruleGenericFunction"
    // InternalDsl.g:137:1: ruleGenericFunction : ( ( rule__GenericFunction__Alternatives ) ) ;
    public final void ruleGenericFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__GenericFunction__Alternatives ) ) )
            // InternalDsl.g:142:2: ( ( rule__GenericFunction__Alternatives ) )
            {
            // InternalDsl.g:142:2: ( ( rule__GenericFunction__Alternatives ) )
            // InternalDsl.g:143:3: ( rule__GenericFunction__Alternatives )
            {
             before(grammarAccess.getGenericFunctionAccess().getAlternatives()); 
            // InternalDsl.g:144:3: ( rule__GenericFunction__Alternatives )
            // InternalDsl.g:144:4: rule__GenericFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenericFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericFunctionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGenericFunction"


    // $ANTLR start "entryRuleActor"
    // InternalDsl.g:153:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleActor EOF )
            // InternalDsl.g:155:1: ruleActor EOF
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
    // InternalDsl.g:162:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Actor__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Actor__Group__0 )
            // InternalDsl.g:169:4: rule__Actor__Group__0
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
    // InternalDsl.g:178:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleComponent EOF )
            // InternalDsl.g:180:1: ruleComponent EOF
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
    // InternalDsl.g:187:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Component__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Component__Group__0 )
            // InternalDsl.g:194:4: rule__Component__Group__0
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


    // $ANTLR start "entryRuleConfigurationItem"
    // InternalDsl.g:203:1: entryRuleConfigurationItem : ruleConfigurationItem EOF ;
    public final void entryRuleConfigurationItem() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleConfigurationItem EOF )
            // InternalDsl.g:205:1: ruleConfigurationItem EOF
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
    // InternalDsl.g:212:1: ruleConfigurationItem : ( ( rule__ConfigurationItem__Group__0 ) ) ;
    public final void ruleConfigurationItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__ConfigurationItem__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__ConfigurationItem__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__ConfigurationItem__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__ConfigurationItem__Group__0 )
            {
             before(grammarAccess.getConfigurationItemAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__ConfigurationItem__Group__0 )
            // InternalDsl.g:219:4: rule__ConfigurationItem__Group__0
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
    // InternalDsl.g:228:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleFunction EOF )
            // InternalDsl.g:230:1: ruleFunction EOF
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
    // InternalDsl.g:237:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Function__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Function__Group__0 )
            // InternalDsl.g:244:4: rule__Function__Group__0
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
    // InternalDsl.g:253:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleActivity EOF )
            // InternalDsl.g:255:1: ruleActivity EOF
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
    // InternalDsl.g:262:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Activity__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Activity__Group__0 )
            // InternalDsl.g:269:4: rule__Activity__Group__0
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
    // InternalDsl.g:278:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleEntity EOF )
            // InternalDsl.g:280:1: ruleEntity EOF
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
    // InternalDsl.g:287:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Entity__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Entity__Group__0 )
            // InternalDsl.g:294:4: rule__Entity__Group__0
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


    // $ANTLR start "rule__Model__MessagesOrReferencesAlternatives_3_0"
    // InternalDsl.g:527:1: rule__Model__MessagesOrReferencesAlternatives_3_0 : ( ( ruleMessage ) | ( ruleReference ) );
    public final void rule__Model__MessagesOrReferencesAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:531:1: ( ( ruleMessage ) | ( ruleReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING||(LA1_0>=27 && LA1_0<=28)) ) {
                alt1=1;
            }
            else if ( (LA1_0==29) ) {
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
                     before(grammarAccess.getModelAccess().getMessagesOrReferencesMessageParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMessagesOrReferencesMessageParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:538:2: ( ruleReference )
                    {
                    // InternalDsl.g:538:2: ( ruleReference )
                    // InternalDsl.g:539:3: ruleReference
                    {
                     before(grammarAccess.getModelAccess().getMessagesOrReferencesReferenceParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMessagesOrReferencesReferenceParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__Model__MessagesOrReferencesAlternatives_3_0"


    // $ANTLR start "rule__Participant__Alternatives"
    // InternalDsl.g:548:1: rule__Participant__Alternatives : ( ( ruleGenericComponent ) | ( ruleGenericFunction ) );
    public final void rule__Participant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:552:1: ( ( ruleGenericComponent ) | ( ruleGenericFunction ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=17)||LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==18||LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:553:2: ( ruleGenericComponent )
                    {
                    // InternalDsl.g:553:2: ( ruleGenericComponent )
                    // InternalDsl.g:554:3: ruleGenericComponent
                    {
                     before(grammarAccess.getParticipantAccess().getGenericComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGenericComponent();

                    state._fsp--;

                     after(grammarAccess.getParticipantAccess().getGenericComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:559:2: ( ruleGenericFunction )
                    {
                    // InternalDsl.g:559:2: ( ruleGenericFunction )
                    // InternalDsl.g:560:3: ruleGenericFunction
                    {
                     before(grammarAccess.getParticipantAccess().getGenericFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGenericFunction();

                    state._fsp--;

                     after(grammarAccess.getParticipantAccess().getGenericFunctionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Participant__Alternatives"


    // $ANTLR start "rule__GenericComponent__Alternatives"
    // InternalDsl.g:569:1: rule__GenericComponent__Alternatives : ( ( ruleEntity ) | ( ruleActor ) | ( ruleComponent ) | ( ruleConfigurationItem ) );
    public final void rule__GenericComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:573:1: ( ( ruleEntity ) | ( ruleActor ) | ( ruleComponent ) | ( ruleConfigurationItem ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:574:2: ( ruleEntity )
                    {
                    // InternalDsl.g:574:2: ( ruleEntity )
                    // InternalDsl.g:575:3: ruleEntity
                    {
                     before(grammarAccess.getGenericComponentAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:580:2: ( ruleActor )
                    {
                    // InternalDsl.g:580:2: ( ruleActor )
                    // InternalDsl.g:581:3: ruleActor
                    {
                     before(grammarAccess.getGenericComponentAccess().getActorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getActorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:586:2: ( ruleComponent )
                    {
                    // InternalDsl.g:586:2: ( ruleComponent )
                    // InternalDsl.g:587:3: ruleComponent
                    {
                     before(grammarAccess.getGenericComponentAccess().getComponentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getComponentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:592:2: ( ruleConfigurationItem )
                    {
                    // InternalDsl.g:592:2: ( ruleConfigurationItem )
                    // InternalDsl.g:593:3: ruleConfigurationItem
                    {
                     before(grammarAccess.getGenericComponentAccess().getConfigurationItemParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigurationItem();

                    state._fsp--;

                     after(grammarAccess.getGenericComponentAccess().getConfigurationItemParserRuleCall_3()); 

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
    // $ANTLR end "rule__GenericComponent__Alternatives"


    // $ANTLR start "rule__GenericFunction__Alternatives"
    // InternalDsl.g:602:1: rule__GenericFunction__Alternatives : ( ( ruleFunction ) | ( ruleActivity ) );
    public final void rule__GenericFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:606:1: ( ( ruleFunction ) | ( ruleActivity ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:607:2: ( ruleFunction )
                    {
                    // InternalDsl.g:607:2: ( ruleFunction )
                    // InternalDsl.g:608:3: ruleFunction
                    {
                     before(grammarAccess.getGenericFunctionAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getGenericFunctionAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:613:2: ( ruleActivity )
                    {
                    // InternalDsl.g:613:2: ( ruleActivity )
                    // InternalDsl.g:614:3: ruleActivity
                    {
                     before(grammarAccess.getGenericFunctionAccess().getActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getGenericFunctionAccess().getActivityParserRuleCall_1()); 

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
    // $ANTLR end "rule__GenericFunction__Alternatives"


    // $ANTLR start "rule__Component__NatureAlternatives_2_0"
    // InternalDsl.g:623:1: rule__Component__NatureAlternatives_2_0 : ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) );
    public final void rule__Component__NatureAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:627:1: ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:628:2: ( 'unset' )
                    {
                    // InternalDsl.g:628:2: ( 'unset' )
                    // InternalDsl.g:629:3: 'unset'
                    {
                     before(grammarAccess.getComponentAccess().getNatureUnsetKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getNatureUnsetKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:634:2: ( 'behavior' )
                    {
                    // InternalDsl.g:634:2: ( 'behavior' )
                    // InternalDsl.g:635:3: 'behavior'
                    {
                     before(grammarAccess.getComponentAccess().getNatureBehaviorKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getNatureBehaviorKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:640:2: ( 'node' )
                    {
                    // InternalDsl.g:640:2: ( 'node' )
                    // InternalDsl.g:641:3: 'node'
                    {
                     before(grammarAccess.getComponentAccess().getNatureNodeKeyword_2_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getNatureNodeKeyword_2_0_2()); 

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
    // $ANTLR end "rule__Component__NatureAlternatives_2_0"


    // $ANTLR start "rule__Message__Alternatives"
    // InternalDsl.g:650:1: rule__Message__Alternatives : ( ( ruleSequenceMessageType ) | ( ruleArmTimerMessage ) | ( ruleParticipantDeactivation ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:654:1: ( ( ruleSequenceMessageType ) | ( ruleArmTimerMessage ) | ( ruleParticipantDeactivation ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:655:2: ( ruleSequenceMessageType )
                    {
                    // InternalDsl.g:655:2: ( ruleSequenceMessageType )
                    // InternalDsl.g:656:3: ruleSequenceMessageType
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
                    // InternalDsl.g:661:2: ( ruleArmTimerMessage )
                    {
                    // InternalDsl.g:661:2: ( ruleArmTimerMessage )
                    // InternalDsl.g:662:3: ruleArmTimerMessage
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
                    // InternalDsl.g:667:2: ( ruleParticipantDeactivation )
                    {
                    // InternalDsl.g:667:2: ( ruleParticipantDeactivation )
                    // InternalDsl.g:668:3: ruleParticipantDeactivation
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
    // InternalDsl.g:677:1: rule__SequenceMessageType__Alternatives_0 : ( ( ruleSequenceMessage ) | ( ruleCreateMessage ) | ( ruleDeleteMessage ) );
    public final void rule__SequenceMessageType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:681:1: ( ( ruleSequenceMessage ) | ( ruleCreateMessage ) | ( ruleDeleteMessage ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt7=3;
                    }
                    break;
                case 22:
                    {
                    alt7=1;
                    }
                    break;
                case 24:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:682:2: ( ruleSequenceMessage )
                    {
                    // InternalDsl.g:682:2: ( ruleSequenceMessage )
                    // InternalDsl.g:683:3: ruleSequenceMessage
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
                    // InternalDsl.g:688:2: ( ruleCreateMessage )
                    {
                    // InternalDsl.g:688:2: ( ruleCreateMessage )
                    // InternalDsl.g:689:3: ruleCreateMessage
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
                    // InternalDsl.g:694:2: ( ruleDeleteMessage )
                    {
                    // InternalDsl.g:694:2: ( ruleDeleteMessage )
                    // InternalDsl.g:695:3: ruleDeleteMessage
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
    // InternalDsl.g:704:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:708:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:709:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDsl.g:716:1: rule__Model__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:720:1: ( ( 'scenario' ) )
            // InternalDsl.g:721:1: ( 'scenario' )
            {
            // InternalDsl.g:721:1: ( 'scenario' )
            // InternalDsl.g:722:2: 'scenario'
            {
             before(grammarAccess.getModelAccess().getScenarioKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDsl.g:731:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:735:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDsl.g:736:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalDsl.g:743:1: rule__Model__Group__1__Impl : ( ( rule__Model__BeginAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:747:1: ( ( ( rule__Model__BeginAssignment_1 ) ) )
            // InternalDsl.g:748:1: ( ( rule__Model__BeginAssignment_1 ) )
            {
            // InternalDsl.g:748:1: ( ( rule__Model__BeginAssignment_1 ) )
            // InternalDsl.g:749:2: ( rule__Model__BeginAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getBeginAssignment_1()); 
            // InternalDsl.g:750:2: ( rule__Model__BeginAssignment_1 )
            // InternalDsl.g:750:3: rule__Model__BeginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__BeginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBeginAssignment_1()); 

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
    // InternalDsl.g:758:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:762:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDsl.g:763:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalDsl.g:770:1: rule__Model__Group__2__Impl : ( ( rule__Model__ParticipantsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:774:1: ( ( ( rule__Model__ParticipantsAssignment_2 )* ) )
            // InternalDsl.g:775:1: ( ( rule__Model__ParticipantsAssignment_2 )* )
            {
            // InternalDsl.g:775:1: ( ( rule__Model__ParticipantsAssignment_2 )* )
            // InternalDsl.g:776:2: ( rule__Model__ParticipantsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getParticipantsAssignment_2()); 
            // InternalDsl.g:777:2: ( rule__Model__ParticipantsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=18)||(LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:777:3: rule__Model__ParticipantsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ParticipantsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getParticipantsAssignment_2()); 

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
    // InternalDsl.g:785:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:789:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalDsl.g:790:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // InternalDsl.g:797:1: rule__Model__Group__3__Impl : ( ( rule__Model__MessagesOrReferencesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:801:1: ( ( ( rule__Model__MessagesOrReferencesAssignment_3 )* ) )
            // InternalDsl.g:802:1: ( ( rule__Model__MessagesOrReferencesAssignment_3 )* )
            {
            // InternalDsl.g:802:1: ( ( rule__Model__MessagesOrReferencesAssignment_3 )* )
            // InternalDsl.g:803:2: ( rule__Model__MessagesOrReferencesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getMessagesOrReferencesAssignment_3()); 
            // InternalDsl.g:804:2: ( rule__Model__MessagesOrReferencesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||(LA9_0>=27 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:804:3: rule__Model__MessagesOrReferencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__MessagesOrReferencesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMessagesOrReferencesAssignment_3()); 

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


    // $ANTLR start "rule__Model__Group__4"
    // InternalDsl.g:812:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:816:1: ( rule__Model__Group__4__Impl )
            // InternalDsl.g:817:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalDsl.g:823:1: rule__Model__Group__4__Impl : ( ( rule__Model__EndAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:827:1: ( ( ( rule__Model__EndAssignment_4 ) ) )
            // InternalDsl.g:828:1: ( ( rule__Model__EndAssignment_4 ) )
            {
            // InternalDsl.g:828:1: ( ( rule__Model__EndAssignment_4 ) )
            // InternalDsl.g:829:2: ( rule__Model__EndAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getEndAssignment_4()); 
            // InternalDsl.g:830:2: ( rule__Model__EndAssignment_4 )
            // InternalDsl.g:830:3: rule__Model__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEndAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalDsl.g:839:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:843:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalDsl.g:844:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
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
    // InternalDsl.g:851:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:855:1: ( ( 'actor' ) )
            // InternalDsl.g:856:1: ( 'actor' )
            {
            // InternalDsl.g:856:1: ( 'actor' )
            // InternalDsl.g:857:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDsl.g:866:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:870:1: ( rule__Actor__Group__1__Impl )
            // InternalDsl.g:871:2: rule__Actor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__1__Impl();

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
    // InternalDsl.g:877:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:881:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalDsl.g:882:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalDsl.g:882:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalDsl.g:883:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalDsl.g:884:2: ( rule__Actor__NameAssignment_1 )
            // InternalDsl.g:884:3: rule__Actor__NameAssignment_1
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


    // $ANTLR start "rule__Component__Group__0"
    // InternalDsl.g:893:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:897:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDsl.g:898:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalDsl.g:905:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:909:1: ( ( 'component' ) )
            // InternalDsl.g:910:1: ( 'component' )
            {
            // InternalDsl.g:910:1: ( 'component' )
            // InternalDsl.g:911:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:920:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:924:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDsl.g:925:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:932:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:936:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalDsl.g:937:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalDsl.g:937:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalDsl.g:938:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalDsl.g:939:2: ( rule__Component__NameAssignment_1 )
            // InternalDsl.g:939:3: rule__Component__NameAssignment_1
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
    // InternalDsl.g:947:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:951:1: ( rule__Component__Group__2__Impl )
            // InternalDsl.g:952:2: rule__Component__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__2__Impl();

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
    // InternalDsl.g:958:1: rule__Component__Group__2__Impl : ( ( rule__Component__NatureAssignment_2 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:962:1: ( ( ( rule__Component__NatureAssignment_2 )? ) )
            // InternalDsl.g:963:1: ( ( rule__Component__NatureAssignment_2 )? )
            {
            // InternalDsl.g:963:1: ( ( rule__Component__NatureAssignment_2 )? )
            // InternalDsl.g:964:2: ( rule__Component__NatureAssignment_2 )?
            {
             before(grammarAccess.getComponentAccess().getNatureAssignment_2()); 
            // InternalDsl.g:965:2: ( rule__Component__NatureAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=11 && LA10_0<=13)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:965:3: rule__Component__NatureAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__NatureAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getNatureAssignment_2()); 

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


    // $ANTLR start "rule__ConfigurationItem__Group__0"
    // InternalDsl.g:974:1: rule__ConfigurationItem__Group__0 : rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 ;
    public final void rule__ConfigurationItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:978:1: ( rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 )
            // InternalDsl.g:979:2: rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1
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
    // InternalDsl.g:986:1: rule__ConfigurationItem__Group__0__Impl : ( 'configuration_item' ) ;
    public final void rule__ConfigurationItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:990:1: ( ( 'configuration_item' ) )
            // InternalDsl.g:991:1: ( 'configuration_item' )
            {
            // InternalDsl.g:991:1: ( 'configuration_item' )
            // InternalDsl.g:992:2: 'configuration_item'
            {
             before(grammarAccess.getConfigurationItemAccess().getConfiguration_itemKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1001:1: rule__ConfigurationItem__Group__1 : rule__ConfigurationItem__Group__1__Impl ;
    public final void rule__ConfigurationItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1005:1: ( rule__ConfigurationItem__Group__1__Impl )
            // InternalDsl.g:1006:2: rule__ConfigurationItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__1__Impl();

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
    // InternalDsl.g:1012:1: rule__ConfigurationItem__Group__1__Impl : ( ( rule__ConfigurationItem__NameAssignment_1 ) ) ;
    public final void rule__ConfigurationItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:1: ( ( ( rule__ConfigurationItem__NameAssignment_1 ) ) )
            // InternalDsl.g:1017:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            {
            // InternalDsl.g:1017:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            // InternalDsl.g:1018:2: ( rule__ConfigurationItem__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationItemAccess().getNameAssignment_1()); 
            // InternalDsl.g:1019:2: ( rule__ConfigurationItem__NameAssignment_1 )
            // InternalDsl.g:1019:3: rule__ConfigurationItem__NameAssignment_1
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


    // $ANTLR start "rule__Function__Group__0"
    // InternalDsl.g:1028:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1032:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalDsl.g:1033:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalDsl.g:1040:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1044:1: ( ( 'function' ) )
            // InternalDsl.g:1045:1: ( 'function' )
            {
            // InternalDsl.g:1045:1: ( 'function' )
            // InternalDsl.g:1046:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:1055:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1059:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalDsl.g:1060:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1067:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1071:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalDsl.g:1072:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalDsl.g:1072:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalDsl.g:1073:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalDsl.g:1074:2: ( rule__Function__NameAssignment_1 )
            // InternalDsl.g:1074:3: rule__Function__NameAssignment_1
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
    // InternalDsl.g:1082:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1086:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalDsl.g:1087:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1094:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1098:1: ( ( 'as' ) )
            // InternalDsl.g:1099:1: ( 'as' )
            {
            // InternalDsl.g:1099:1: ( 'as' )
            // InternalDsl.g:1100:2: 'as'
            {
             before(grammarAccess.getFunctionAccess().getAsKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDsl.g:1109:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1113:1: ( rule__Function__Group__3__Impl )
            // InternalDsl.g:1114:2: rule__Function__Group__3__Impl
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
    // InternalDsl.g:1120:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1124:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalDsl.g:1125:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalDsl.g:1125:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalDsl.g:1126:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalDsl.g:1127:2: ( rule__Function__IdAssignment_3 )
            // InternalDsl.g:1127:3: rule__Function__IdAssignment_3
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
    // InternalDsl.g:1136:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1140:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalDsl.g:1141:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
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
    // InternalDsl.g:1148:1: rule__Activity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1152:1: ( ( 'activity' ) )
            // InternalDsl.g:1153:1: ( 'activity' )
            {
            // InternalDsl.g:1153:1: ( 'activity' )
            // InternalDsl.g:1154:2: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDsl.g:1163:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1167:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalDsl.g:1168:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1175:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1179:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // InternalDsl.g:1180:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // InternalDsl.g:1180:1: ( ( rule__Activity__NameAssignment_1 ) )
            // InternalDsl.g:1181:2: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // InternalDsl.g:1182:2: ( rule__Activity__NameAssignment_1 )
            // InternalDsl.g:1182:3: rule__Activity__NameAssignment_1
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
    // InternalDsl.g:1190:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1194:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalDsl.g:1195:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1202:1: rule__Activity__Group__2__Impl : ( 'as' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1206:1: ( ( 'as' ) )
            // InternalDsl.g:1207:1: ( 'as' )
            {
            // InternalDsl.g:1207:1: ( 'as' )
            // InternalDsl.g:1208:2: 'as'
            {
             before(grammarAccess.getActivityAccess().getAsKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDsl.g:1217:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1221:1: ( rule__Activity__Group__3__Impl )
            // InternalDsl.g:1222:2: rule__Activity__Group__3__Impl
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
    // InternalDsl.g:1228:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__IdAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1232:1: ( ( ( rule__Activity__IdAssignment_3 ) ) )
            // InternalDsl.g:1233:1: ( ( rule__Activity__IdAssignment_3 ) )
            {
            // InternalDsl.g:1233:1: ( ( rule__Activity__IdAssignment_3 ) )
            // InternalDsl.g:1234:2: ( rule__Activity__IdAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getIdAssignment_3()); 
            // InternalDsl.g:1235:2: ( rule__Activity__IdAssignment_3 )
            // InternalDsl.g:1235:3: rule__Activity__IdAssignment_3
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
    // InternalDsl.g:1244:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1248:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDsl.g:1249:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalDsl.g:1256:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1260:1: ( ( 'entity' ) )
            // InternalDsl.g:1261:1: ( 'entity' )
            {
            // InternalDsl.g:1261:1: ( 'entity' )
            // InternalDsl.g:1262:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1271:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1275:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDsl.g:1276:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1283:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1287:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDsl.g:1288:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDsl.g:1288:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDsl.g:1289:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDsl.g:1290:2: ( rule__Entity__NameAssignment_1 )
            // InternalDsl.g:1290:3: rule__Entity__NameAssignment_1
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
    // InternalDsl.g:1298:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1302:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDsl.g:1303:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1310:1: rule__Entity__Group__2__Impl : ( 'as' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1314:1: ( ( 'as' ) )
            // InternalDsl.g:1315:1: ( 'as' )
            {
            // InternalDsl.g:1315:1: ( 'as' )
            // InternalDsl.g:1316:2: 'as'
            {
             before(grammarAccess.getEntityAccess().getAsKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDsl.g:1325:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1329:1: ( rule__Entity__Group__3__Impl )
            // InternalDsl.g:1330:2: rule__Entity__Group__3__Impl
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
    // InternalDsl.g:1336:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__IdAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1340:1: ( ( ( rule__Entity__IdAssignment_3 ) ) )
            // InternalDsl.g:1341:1: ( ( rule__Entity__IdAssignment_3 ) )
            {
            // InternalDsl.g:1341:1: ( ( rule__Entity__IdAssignment_3 ) )
            // InternalDsl.g:1342:2: ( rule__Entity__IdAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getIdAssignment_3()); 
            // InternalDsl.g:1343:2: ( rule__Entity__IdAssignment_3 )
            // InternalDsl.g:1343:3: rule__Entity__IdAssignment_3
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


    // $ANTLR start "rule__SequenceMessageType__Group__0"
    // InternalDsl.g:1352:1: rule__SequenceMessageType__Group__0 : rule__SequenceMessageType__Group__0__Impl rule__SequenceMessageType__Group__1 ;
    public final void rule__SequenceMessageType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1356:1: ( rule__SequenceMessageType__Group__0__Impl rule__SequenceMessageType__Group__1 )
            // InternalDsl.g:1357:2: rule__SequenceMessageType__Group__0__Impl rule__SequenceMessageType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1364:1: rule__SequenceMessageType__Group__0__Impl : ( ( rule__SequenceMessageType__Alternatives_0 ) ) ;
    public final void rule__SequenceMessageType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1368:1: ( ( ( rule__SequenceMessageType__Alternatives_0 ) ) )
            // InternalDsl.g:1369:1: ( ( rule__SequenceMessageType__Alternatives_0 ) )
            {
            // InternalDsl.g:1369:1: ( ( rule__SequenceMessageType__Alternatives_0 ) )
            // InternalDsl.g:1370:2: ( rule__SequenceMessageType__Alternatives_0 )
            {
             before(grammarAccess.getSequenceMessageTypeAccess().getAlternatives_0()); 
            // InternalDsl.g:1371:2: ( rule__SequenceMessageType__Alternatives_0 )
            // InternalDsl.g:1371:3: rule__SequenceMessageType__Alternatives_0
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
    // InternalDsl.g:1379:1: rule__SequenceMessageType__Group__1 : rule__SequenceMessageType__Group__1__Impl ;
    public final void rule__SequenceMessageType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1383:1: ( rule__SequenceMessageType__Group__1__Impl )
            // InternalDsl.g:1384:2: rule__SequenceMessageType__Group__1__Impl
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
    // InternalDsl.g:1390:1: rule__SequenceMessageType__Group__1__Impl : ( ( rule__SequenceMessageType__ReturnAssignment_1 )? ) ;
    public final void rule__SequenceMessageType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1394:1: ( ( ( rule__SequenceMessageType__ReturnAssignment_1 )? ) )
            // InternalDsl.g:1395:1: ( ( rule__SequenceMessageType__ReturnAssignment_1 )? )
            {
            // InternalDsl.g:1395:1: ( ( rule__SequenceMessageType__ReturnAssignment_1 )? )
            // InternalDsl.g:1396:2: ( rule__SequenceMessageType__ReturnAssignment_1 )?
            {
             before(grammarAccess.getSequenceMessageTypeAccess().getReturnAssignment_1()); 
            // InternalDsl.g:1397:2: ( rule__SequenceMessageType__ReturnAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==26) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1397:3: rule__SequenceMessageType__ReturnAssignment_1
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
    // InternalDsl.g:1406:1: rule__SequenceMessage__Group__0 : rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1 ;
    public final void rule__SequenceMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1410:1: ( rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1 )
            // InternalDsl.g:1411:2: rule__SequenceMessage__Group__0__Impl rule__SequenceMessage__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1418:1: rule__SequenceMessage__Group__0__Impl : ( ( rule__SequenceMessage__SourceAssignment_0 ) ) ;
    public final void rule__SequenceMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1422:1: ( ( ( rule__SequenceMessage__SourceAssignment_0 ) ) )
            // InternalDsl.g:1423:1: ( ( rule__SequenceMessage__SourceAssignment_0 ) )
            {
            // InternalDsl.g:1423:1: ( ( rule__SequenceMessage__SourceAssignment_0 ) )
            // InternalDsl.g:1424:2: ( rule__SequenceMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getSequenceMessageAccess().getSourceAssignment_0()); 
            // InternalDsl.g:1425:2: ( rule__SequenceMessage__SourceAssignment_0 )
            // InternalDsl.g:1425:3: rule__SequenceMessage__SourceAssignment_0
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
    // InternalDsl.g:1433:1: rule__SequenceMessage__Group__1 : rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2 ;
    public final void rule__SequenceMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1437:1: ( rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2 )
            // InternalDsl.g:1438:2: rule__SequenceMessage__Group__1__Impl rule__SequenceMessage__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1445:1: rule__SequenceMessage__Group__1__Impl : ( '->' ) ;
    public final void rule__SequenceMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1449:1: ( ( '->' ) )
            // InternalDsl.g:1450:1: ( '->' )
            {
            // InternalDsl.g:1450:1: ( '->' )
            // InternalDsl.g:1451:2: '->'
            {
             before(grammarAccess.getSequenceMessageAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1460:1: rule__SequenceMessage__Group__2 : rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3 ;
    public final void rule__SequenceMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1464:1: ( rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3 )
            // InternalDsl.g:1465:2: rule__SequenceMessage__Group__2__Impl rule__SequenceMessage__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1472:1: rule__SequenceMessage__Group__2__Impl : ( ( rule__SequenceMessage__TargetAssignment_2 ) ) ;
    public final void rule__SequenceMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1476:1: ( ( ( rule__SequenceMessage__TargetAssignment_2 ) ) )
            // InternalDsl.g:1477:1: ( ( rule__SequenceMessage__TargetAssignment_2 ) )
            {
            // InternalDsl.g:1477:1: ( ( rule__SequenceMessage__TargetAssignment_2 ) )
            // InternalDsl.g:1478:2: ( rule__SequenceMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getSequenceMessageAccess().getTargetAssignment_2()); 
            // InternalDsl.g:1479:2: ( rule__SequenceMessage__TargetAssignment_2 )
            // InternalDsl.g:1479:3: rule__SequenceMessage__TargetAssignment_2
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
    // InternalDsl.g:1487:1: rule__SequenceMessage__Group__3 : rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4 ;
    public final void rule__SequenceMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1491:1: ( rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4 )
            // InternalDsl.g:1492:2: rule__SequenceMessage__Group__3__Impl rule__SequenceMessage__Group__4
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
    // InternalDsl.g:1499:1: rule__SequenceMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__SequenceMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1503:1: ( ( ':' ) )
            // InternalDsl.g:1504:1: ( ':' )
            {
            // InternalDsl.g:1504:1: ( ':' )
            // InternalDsl.g:1505:2: ':'
            {
             before(grammarAccess.getSequenceMessageAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1514:1: rule__SequenceMessage__Group__4 : rule__SequenceMessage__Group__4__Impl ;
    public final void rule__SequenceMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1518:1: ( rule__SequenceMessage__Group__4__Impl )
            // InternalDsl.g:1519:2: rule__SequenceMessage__Group__4__Impl
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
    // InternalDsl.g:1525:1: rule__SequenceMessage__Group__4__Impl : ( ( rule__SequenceMessage__NameAssignment_4 ) ) ;
    public final void rule__SequenceMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1529:1: ( ( ( rule__SequenceMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:1530:1: ( ( rule__SequenceMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:1530:1: ( ( rule__SequenceMessage__NameAssignment_4 ) )
            // InternalDsl.g:1531:2: ( rule__SequenceMessage__NameAssignment_4 )
            {
             before(grammarAccess.getSequenceMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:1532:2: ( rule__SequenceMessage__NameAssignment_4 )
            // InternalDsl.g:1532:3: rule__SequenceMessage__NameAssignment_4
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
    // InternalDsl.g:1541:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1545:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalDsl.g:1546:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1553:1: rule__CreateMessage__Group__0__Impl : ( ( rule__CreateMessage__SourceAssignment_0 ) ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1557:1: ( ( ( rule__CreateMessage__SourceAssignment_0 ) ) )
            // InternalDsl.g:1558:1: ( ( rule__CreateMessage__SourceAssignment_0 ) )
            {
            // InternalDsl.g:1558:1: ( ( rule__CreateMessage__SourceAssignment_0 ) )
            // InternalDsl.g:1559:2: ( rule__CreateMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getCreateMessageAccess().getSourceAssignment_0()); 
            // InternalDsl.g:1560:2: ( rule__CreateMessage__SourceAssignment_0 )
            // InternalDsl.g:1560:3: rule__CreateMessage__SourceAssignment_0
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
    // InternalDsl.g:1568:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1572:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalDsl.g:1573:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1580:1: rule__CreateMessage__Group__1__Impl : ( '->+' ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1584:1: ( ( '->+' ) )
            // InternalDsl.g:1585:1: ( '->+' )
            {
            // InternalDsl.g:1585:1: ( '->+' )
            // InternalDsl.g:1586:2: '->+'
            {
             before(grammarAccess.getCreateMessageAccess().getHyphenMinusGreaterThanSignPlusSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDsl.g:1595:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1599:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalDsl.g:1600:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1607:1: rule__CreateMessage__Group__2__Impl : ( ( rule__CreateMessage__TargetAssignment_2 ) ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1611:1: ( ( ( rule__CreateMessage__TargetAssignment_2 ) ) )
            // InternalDsl.g:1612:1: ( ( rule__CreateMessage__TargetAssignment_2 ) )
            {
            // InternalDsl.g:1612:1: ( ( rule__CreateMessage__TargetAssignment_2 ) )
            // InternalDsl.g:1613:2: ( rule__CreateMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getCreateMessageAccess().getTargetAssignment_2()); 
            // InternalDsl.g:1614:2: ( rule__CreateMessage__TargetAssignment_2 )
            // InternalDsl.g:1614:3: rule__CreateMessage__TargetAssignment_2
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
    // InternalDsl.g:1622:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1626:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalDsl.g:1627:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
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
    // InternalDsl.g:1634:1: rule__CreateMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1638:1: ( ( ':' ) )
            // InternalDsl.g:1639:1: ( ':' )
            {
            // InternalDsl.g:1639:1: ( ':' )
            // InternalDsl.g:1640:2: ':'
            {
             before(grammarAccess.getCreateMessageAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1649:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1653:1: ( rule__CreateMessage__Group__4__Impl )
            // InternalDsl.g:1654:2: rule__CreateMessage__Group__4__Impl
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
    // InternalDsl.g:1660:1: rule__CreateMessage__Group__4__Impl : ( ( rule__CreateMessage__NameAssignment_4 ) ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1664:1: ( ( ( rule__CreateMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:1665:1: ( ( rule__CreateMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:1665:1: ( ( rule__CreateMessage__NameAssignment_4 ) )
            // InternalDsl.g:1666:2: ( rule__CreateMessage__NameAssignment_4 )
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:1667:2: ( rule__CreateMessage__NameAssignment_4 )
            // InternalDsl.g:1667:3: rule__CreateMessage__NameAssignment_4
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
    // InternalDsl.g:1676:1: rule__DeleteMessage__Group__0 : rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 ;
    public final void rule__DeleteMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1680:1: ( rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 )
            // InternalDsl.g:1681:2: rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1688:1: rule__DeleteMessage__Group__0__Impl : ( ( rule__DeleteMessage__SourceAssignment_0 ) ) ;
    public final void rule__DeleteMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1692:1: ( ( ( rule__DeleteMessage__SourceAssignment_0 ) ) )
            // InternalDsl.g:1693:1: ( ( rule__DeleteMessage__SourceAssignment_0 ) )
            {
            // InternalDsl.g:1693:1: ( ( rule__DeleteMessage__SourceAssignment_0 ) )
            // InternalDsl.g:1694:2: ( rule__DeleteMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getDeleteMessageAccess().getSourceAssignment_0()); 
            // InternalDsl.g:1695:2: ( rule__DeleteMessage__SourceAssignment_0 )
            // InternalDsl.g:1695:3: rule__DeleteMessage__SourceAssignment_0
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
    // InternalDsl.g:1703:1: rule__DeleteMessage__Group__1 : rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 ;
    public final void rule__DeleteMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1707:1: ( rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 )
            // InternalDsl.g:1708:2: rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1715:1: rule__DeleteMessage__Group__1__Impl : ( '->x' ) ;
    public final void rule__DeleteMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1719:1: ( ( '->x' ) )
            // InternalDsl.g:1720:1: ( '->x' )
            {
            // InternalDsl.g:1720:1: ( '->x' )
            // InternalDsl.g:1721:2: '->x'
            {
             before(grammarAccess.getDeleteMessageAccess().getXKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1730:1: rule__DeleteMessage__Group__2 : rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 ;
    public final void rule__DeleteMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1734:1: ( rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 )
            // InternalDsl.g:1735:2: rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1742:1: rule__DeleteMessage__Group__2__Impl : ( ( rule__DeleteMessage__TargetAssignment_2 ) ) ;
    public final void rule__DeleteMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1746:1: ( ( ( rule__DeleteMessage__TargetAssignment_2 ) ) )
            // InternalDsl.g:1747:1: ( ( rule__DeleteMessage__TargetAssignment_2 ) )
            {
            // InternalDsl.g:1747:1: ( ( rule__DeleteMessage__TargetAssignment_2 ) )
            // InternalDsl.g:1748:2: ( rule__DeleteMessage__TargetAssignment_2 )
            {
             before(grammarAccess.getDeleteMessageAccess().getTargetAssignment_2()); 
            // InternalDsl.g:1749:2: ( rule__DeleteMessage__TargetAssignment_2 )
            // InternalDsl.g:1749:3: rule__DeleteMessage__TargetAssignment_2
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
    // InternalDsl.g:1757:1: rule__DeleteMessage__Group__3 : rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4 ;
    public final void rule__DeleteMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1761:1: ( rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4 )
            // InternalDsl.g:1762:2: rule__DeleteMessage__Group__3__Impl rule__DeleteMessage__Group__4
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
    // InternalDsl.g:1769:1: rule__DeleteMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__DeleteMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1773:1: ( ( ':' ) )
            // InternalDsl.g:1774:1: ( ':' )
            {
            // InternalDsl.g:1774:1: ( ':' )
            // InternalDsl.g:1775:2: ':'
            {
             before(grammarAccess.getDeleteMessageAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1784:1: rule__DeleteMessage__Group__4 : rule__DeleteMessage__Group__4__Impl ;
    public final void rule__DeleteMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1788:1: ( rule__DeleteMessage__Group__4__Impl )
            // InternalDsl.g:1789:2: rule__DeleteMessage__Group__4__Impl
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
    // InternalDsl.g:1795:1: rule__DeleteMessage__Group__4__Impl : ( ( rule__DeleteMessage__NameAssignment_4 ) ) ;
    public final void rule__DeleteMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1799:1: ( ( ( rule__DeleteMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:1800:1: ( ( rule__DeleteMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:1800:1: ( ( rule__DeleteMessage__NameAssignment_4 ) )
            // InternalDsl.g:1801:2: ( rule__DeleteMessage__NameAssignment_4 )
            {
             before(grammarAccess.getDeleteMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:1802:2: ( rule__DeleteMessage__NameAssignment_4 )
            // InternalDsl.g:1802:3: rule__DeleteMessage__NameAssignment_4
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
    // InternalDsl.g:1811:1: rule__ReturnMessage__Group__0 : rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 ;
    public final void rule__ReturnMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1815:1: ( rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 )
            // InternalDsl.g:1816:2: rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1823:1: rule__ReturnMessage__Group__0__Impl : ( ( rule__ReturnMessage__TargetAssignment_0 ) ) ;
    public final void rule__ReturnMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1827:1: ( ( ( rule__ReturnMessage__TargetAssignment_0 ) ) )
            // InternalDsl.g:1828:1: ( ( rule__ReturnMessage__TargetAssignment_0 ) )
            {
            // InternalDsl.g:1828:1: ( ( rule__ReturnMessage__TargetAssignment_0 ) )
            // InternalDsl.g:1829:2: ( rule__ReturnMessage__TargetAssignment_0 )
            {
             before(grammarAccess.getReturnMessageAccess().getTargetAssignment_0()); 
            // InternalDsl.g:1830:2: ( rule__ReturnMessage__TargetAssignment_0 )
            // InternalDsl.g:1830:3: rule__ReturnMessage__TargetAssignment_0
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
    // InternalDsl.g:1838:1: rule__ReturnMessage__Group__1 : rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 ;
    public final void rule__ReturnMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1842:1: ( rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 )
            // InternalDsl.g:1843:2: rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1850:1: rule__ReturnMessage__Group__1__Impl : ( '<--' ) ;
    public final void rule__ReturnMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1854:1: ( ( '<--' ) )
            // InternalDsl.g:1855:1: ( '<--' )
            {
            // InternalDsl.g:1855:1: ( '<--' )
            // InternalDsl.g:1856:2: '<--'
            {
             before(grammarAccess.getReturnMessageAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:1865:1: rule__ReturnMessage__Group__2 : rule__ReturnMessage__Group__2__Impl rule__ReturnMessage__Group__3 ;
    public final void rule__ReturnMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1869:1: ( rule__ReturnMessage__Group__2__Impl rule__ReturnMessage__Group__3 )
            // InternalDsl.g:1870:2: rule__ReturnMessage__Group__2__Impl rule__ReturnMessage__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1877:1: rule__ReturnMessage__Group__2__Impl : ( ( rule__ReturnMessage__SourceAssignment_2 ) ) ;
    public final void rule__ReturnMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1881:1: ( ( ( rule__ReturnMessage__SourceAssignment_2 ) ) )
            // InternalDsl.g:1882:1: ( ( rule__ReturnMessage__SourceAssignment_2 ) )
            {
            // InternalDsl.g:1882:1: ( ( rule__ReturnMessage__SourceAssignment_2 ) )
            // InternalDsl.g:1883:2: ( rule__ReturnMessage__SourceAssignment_2 )
            {
             before(grammarAccess.getReturnMessageAccess().getSourceAssignment_2()); 
            // InternalDsl.g:1884:2: ( rule__ReturnMessage__SourceAssignment_2 )
            // InternalDsl.g:1884:3: rule__ReturnMessage__SourceAssignment_2
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
    // InternalDsl.g:1892:1: rule__ReturnMessage__Group__3 : rule__ReturnMessage__Group__3__Impl rule__ReturnMessage__Group__4 ;
    public final void rule__ReturnMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1896:1: ( rule__ReturnMessage__Group__3__Impl rule__ReturnMessage__Group__4 )
            // InternalDsl.g:1897:2: rule__ReturnMessage__Group__3__Impl rule__ReturnMessage__Group__4
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
    // InternalDsl.g:1904:1: rule__ReturnMessage__Group__3__Impl : ( ':' ) ;
    public final void rule__ReturnMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1908:1: ( ( ':' ) )
            // InternalDsl.g:1909:1: ( ':' )
            {
            // InternalDsl.g:1909:1: ( ':' )
            // InternalDsl.g:1910:2: ':'
            {
             before(grammarAccess.getReturnMessageAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1919:1: rule__ReturnMessage__Group__4 : rule__ReturnMessage__Group__4__Impl ;
    public final void rule__ReturnMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1923:1: ( rule__ReturnMessage__Group__4__Impl )
            // InternalDsl.g:1924:2: rule__ReturnMessage__Group__4__Impl
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
    // InternalDsl.g:1930:1: rule__ReturnMessage__Group__4__Impl : ( ( rule__ReturnMessage__NameAssignment_4 ) ) ;
    public final void rule__ReturnMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1934:1: ( ( ( rule__ReturnMessage__NameAssignment_4 ) ) )
            // InternalDsl.g:1935:1: ( ( rule__ReturnMessage__NameAssignment_4 ) )
            {
            // InternalDsl.g:1935:1: ( ( rule__ReturnMessage__NameAssignment_4 ) )
            // InternalDsl.g:1936:2: ( rule__ReturnMessage__NameAssignment_4 )
            {
             before(grammarAccess.getReturnMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:1937:2: ( rule__ReturnMessage__NameAssignment_4 )
            // InternalDsl.g:1937:3: rule__ReturnMessage__NameAssignment_4
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
    // InternalDsl.g:1946:1: rule__ArmTimerMessage__Group__0 : rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1 ;
    public final void rule__ArmTimerMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1950:1: ( rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1 )
            // InternalDsl.g:1951:2: rule__ArmTimerMessage__Group__0__Impl rule__ArmTimerMessage__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1958:1: rule__ArmTimerMessage__Group__0__Impl : ( '->>' ) ;
    public final void rule__ArmTimerMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1962:1: ( ( '->>' ) )
            // InternalDsl.g:1963:1: ( '->>' )
            {
            // InternalDsl.g:1963:1: ( '->>' )
            // InternalDsl.g:1964:2: '->>'
            {
             before(grammarAccess.getArmTimerMessageAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1973:1: rule__ArmTimerMessage__Group__1 : rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2 ;
    public final void rule__ArmTimerMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1977:1: ( rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2 )
            // InternalDsl.g:1978:2: rule__ArmTimerMessage__Group__1__Impl rule__ArmTimerMessage__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1985:1: rule__ArmTimerMessage__Group__1__Impl : ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) ) ;
    public final void rule__ArmTimerMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1989:1: ( ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) ) )
            // InternalDsl.g:1990:1: ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) )
            {
            // InternalDsl.g:1990:1: ( ( rule__ArmTimerMessage__ParticipantAssignment_1 ) )
            // InternalDsl.g:1991:2: ( rule__ArmTimerMessage__ParticipantAssignment_1 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getParticipantAssignment_1()); 
            // InternalDsl.g:1992:2: ( rule__ArmTimerMessage__ParticipantAssignment_1 )
            // InternalDsl.g:1992:3: rule__ArmTimerMessage__ParticipantAssignment_1
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
    // InternalDsl.g:2000:1: rule__ArmTimerMessage__Group__2 : rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3 ;
    public final void rule__ArmTimerMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2004:1: ( rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3 )
            // InternalDsl.g:2005:2: rule__ArmTimerMessage__Group__2__Impl rule__ArmTimerMessage__Group__3
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
    // InternalDsl.g:2012:1: rule__ArmTimerMessage__Group__2__Impl : ( ':' ) ;
    public final void rule__ArmTimerMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2016:1: ( ( ':' ) )
            // InternalDsl.g:2017:1: ( ':' )
            {
            // InternalDsl.g:2017:1: ( ':' )
            // InternalDsl.g:2018:2: ':'
            {
             before(grammarAccess.getArmTimerMessageAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:2027:1: rule__ArmTimerMessage__Group__3 : rule__ArmTimerMessage__Group__3__Impl ;
    public final void rule__ArmTimerMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2031:1: ( rule__ArmTimerMessage__Group__3__Impl )
            // InternalDsl.g:2032:2: rule__ArmTimerMessage__Group__3__Impl
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
    // InternalDsl.g:2038:1: rule__ArmTimerMessage__Group__3__Impl : ( ( rule__ArmTimerMessage__NameAssignment_3 ) ) ;
    public final void rule__ArmTimerMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2042:1: ( ( ( rule__ArmTimerMessage__NameAssignment_3 ) ) )
            // InternalDsl.g:2043:1: ( ( rule__ArmTimerMessage__NameAssignment_3 ) )
            {
            // InternalDsl.g:2043:1: ( ( rule__ArmTimerMessage__NameAssignment_3 ) )
            // InternalDsl.g:2044:2: ( rule__ArmTimerMessage__NameAssignment_3 )
            {
             before(grammarAccess.getArmTimerMessageAccess().getNameAssignment_3()); 
            // InternalDsl.g:2045:2: ( rule__ArmTimerMessage__NameAssignment_3 )
            // InternalDsl.g:2045:3: rule__ArmTimerMessage__NameAssignment_3
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
    // InternalDsl.g:2054:1: rule__ParticipantDeactivation__Group__0 : rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1 ;
    public final void rule__ParticipantDeactivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2058:1: ( rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1 )
            // InternalDsl.g:2059:2: rule__ParticipantDeactivation__Group__0__Impl rule__ParticipantDeactivation__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:2066:1: rule__ParticipantDeactivation__Group__0__Impl : ( 'deactivate' ) ;
    public final void rule__ParticipantDeactivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2070:1: ( ( 'deactivate' ) )
            // InternalDsl.g:2071:1: ( 'deactivate' )
            {
            // InternalDsl.g:2071:1: ( 'deactivate' )
            // InternalDsl.g:2072:2: 'deactivate'
            {
             before(grammarAccess.getParticipantDeactivationAccess().getDeactivateKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:2081:1: rule__ParticipantDeactivation__Group__1 : rule__ParticipantDeactivation__Group__1__Impl ;
    public final void rule__ParticipantDeactivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2085:1: ( rule__ParticipantDeactivation__Group__1__Impl )
            // InternalDsl.g:2086:2: rule__ParticipantDeactivation__Group__1__Impl
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
    // InternalDsl.g:2092:1: rule__ParticipantDeactivation__Group__1__Impl : ( ( rule__ParticipantDeactivation__NameAssignment_1 ) ) ;
    public final void rule__ParticipantDeactivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2096:1: ( ( ( rule__ParticipantDeactivation__NameAssignment_1 ) ) )
            // InternalDsl.g:2097:1: ( ( rule__ParticipantDeactivation__NameAssignment_1 ) )
            {
            // InternalDsl.g:2097:1: ( ( rule__ParticipantDeactivation__NameAssignment_1 ) )
            // InternalDsl.g:2098:2: ( rule__ParticipantDeactivation__NameAssignment_1 )
            {
             before(grammarAccess.getParticipantDeactivationAccess().getNameAssignment_1()); 
            // InternalDsl.g:2099:2: ( rule__ParticipantDeactivation__NameAssignment_1 )
            // InternalDsl.g:2099:3: rule__ParticipantDeactivation__NameAssignment_1
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
    // InternalDsl.g:2108:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2112:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDsl.g:2113:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:2120:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2124:1: ( ( 'ref' ) )
            // InternalDsl.g:2125:1: ( 'ref' )
            {
            // InternalDsl.g:2125:1: ( 'ref' )
            // InternalDsl.g:2126:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDsl.g:2135:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2139:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalDsl.g:2140:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:2147:1: rule__Reference__Group__1__Impl : ( 'over' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2151:1: ( ( 'over' ) )
            // InternalDsl.g:2152:1: ( 'over' )
            {
            // InternalDsl.g:2152:1: ( 'over' )
            // InternalDsl.g:2153:2: 'over'
            {
             before(grammarAccess.getReferenceAccess().getOverKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDsl.g:2162:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2166:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalDsl.g:2167:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
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
    // InternalDsl.g:2174:1: rule__Reference__Group__2__Impl : ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2178:1: ( ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) ) )
            // InternalDsl.g:2179:1: ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) )
            {
            // InternalDsl.g:2179:1: ( ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* ) )
            // InternalDsl.g:2180:2: ( ( rule__Reference__TimelinesAssignment_2 ) ) ( ( rule__Reference__TimelinesAssignment_2 )* )
            {
            // InternalDsl.g:2180:2: ( ( rule__Reference__TimelinesAssignment_2 ) )
            // InternalDsl.g:2181:3: ( rule__Reference__TimelinesAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 
            // InternalDsl.g:2182:3: ( rule__Reference__TimelinesAssignment_2 )
            // InternalDsl.g:2182:4: rule__Reference__TimelinesAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Reference__TimelinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 

            }

            // InternalDsl.g:2185:2: ( ( rule__Reference__TimelinesAssignment_2 )* )
            // InternalDsl.g:2186:3: ( rule__Reference__TimelinesAssignment_2 )*
            {
             before(grammarAccess.getReferenceAccess().getTimelinesAssignment_2()); 
            // InternalDsl.g:2187:3: ( rule__Reference__TimelinesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_STRING) ) {
                        int LA12_3 = input.LA(3);

                        if ( (LA12_3==EOF||LA12_3==RULE_STRING||(LA12_3>=27 && LA12_3<=29)||LA12_3==32) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:2187:4: rule__Reference__TimelinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Reference__TimelinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:2196:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2200:1: ( rule__Reference__Group__3__Impl )
            // InternalDsl.g:2201:2: rule__Reference__Group__3__Impl
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
    // InternalDsl.g:2207:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__NameAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2211:1: ( ( ( rule__Reference__NameAssignment_3 ) ) )
            // InternalDsl.g:2212:1: ( ( rule__Reference__NameAssignment_3 ) )
            {
            // InternalDsl.g:2212:1: ( ( rule__Reference__NameAssignment_3 ) )
            // InternalDsl.g:2213:2: ( rule__Reference__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_3()); 
            // InternalDsl.g:2214:2: ( rule__Reference__NameAssignment_3 )
            // InternalDsl.g:2214:3: rule__Reference__NameAssignment_3
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


    // $ANTLR start "rule__Model__BeginAssignment_1"
    // InternalDsl.g:2223:1: rule__Model__BeginAssignment_1 : ( ( '{' ) ) ;
    public final void rule__Model__BeginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2227:1: ( ( ( '{' ) ) )
            // InternalDsl.g:2228:2: ( ( '{' ) )
            {
            // InternalDsl.g:2228:2: ( ( '{' ) )
            // InternalDsl.g:2229:3: ( '{' )
            {
             before(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 
            // InternalDsl.g:2230:3: ( '{' )
            // InternalDsl.g:2231:4: '{'
            {
             before(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 

            }

             after(grammarAccess.getModelAccess().getBeginLeftCurlyBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Model__BeginAssignment_1"


    // $ANTLR start "rule__Model__ParticipantsAssignment_2"
    // InternalDsl.g:2242:1: rule__Model__ParticipantsAssignment_2 : ( ruleParticipant ) ;
    public final void rule__Model__ParticipantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2246:1: ( ( ruleParticipant ) )
            // InternalDsl.g:2247:2: ( ruleParticipant )
            {
            // InternalDsl.g:2247:2: ( ruleParticipant )
            // InternalDsl.g:2248:3: ruleParticipant
            {
             before(grammarAccess.getModelAccess().getParticipantsParticipantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getModelAccess().getParticipantsParticipantParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__ParticipantsAssignment_2"


    // $ANTLR start "rule__Model__MessagesOrReferencesAssignment_3"
    // InternalDsl.g:2257:1: rule__Model__MessagesOrReferencesAssignment_3 : ( ( rule__Model__MessagesOrReferencesAlternatives_3_0 ) ) ;
    public final void rule__Model__MessagesOrReferencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2261:1: ( ( ( rule__Model__MessagesOrReferencesAlternatives_3_0 ) ) )
            // InternalDsl.g:2262:2: ( ( rule__Model__MessagesOrReferencesAlternatives_3_0 ) )
            {
            // InternalDsl.g:2262:2: ( ( rule__Model__MessagesOrReferencesAlternatives_3_0 ) )
            // InternalDsl.g:2263:3: ( rule__Model__MessagesOrReferencesAlternatives_3_0 )
            {
             before(grammarAccess.getModelAccess().getMessagesOrReferencesAlternatives_3_0()); 
            // InternalDsl.g:2264:3: ( rule__Model__MessagesOrReferencesAlternatives_3_0 )
            // InternalDsl.g:2264:4: rule__Model__MessagesOrReferencesAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__MessagesOrReferencesAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMessagesOrReferencesAlternatives_3_0()); 

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
    // $ANTLR end "rule__Model__MessagesOrReferencesAssignment_3"


    // $ANTLR start "rule__Model__EndAssignment_4"
    // InternalDsl.g:2272:1: rule__Model__EndAssignment_4 : ( ( '}' ) ) ;
    public final void rule__Model__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2276:1: ( ( ( '}' ) ) )
            // InternalDsl.g:2277:2: ( ( '}' ) )
            {
            // InternalDsl.g:2277:2: ( ( '}' ) )
            // InternalDsl.g:2278:3: ( '}' )
            {
             before(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 
            // InternalDsl.g:2279:3: ( '}' )
            // InternalDsl.g:2280:4: '}'
            {
             before(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 

            }

             after(grammarAccess.getModelAccess().getEndRightCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Model__EndAssignment_4"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalDsl.g:2291:1: rule__Actor__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2295:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2296:2: ( RULE_STRING )
            {
            // InternalDsl.g:2296:2: ( RULE_STRING )
            // InternalDsl.g:2297:3: RULE_STRING
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


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalDsl.g:2306:1: rule__Component__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2310:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2311:2: ( RULE_STRING )
            {
            // InternalDsl.g:2311:2: ( RULE_STRING )
            // InternalDsl.g:2312:3: RULE_STRING
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


    // $ANTLR start "rule__Component__NatureAssignment_2"
    // InternalDsl.g:2321:1: rule__Component__NatureAssignment_2 : ( ( rule__Component__NatureAlternatives_2_0 ) ) ;
    public final void rule__Component__NatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2325:1: ( ( ( rule__Component__NatureAlternatives_2_0 ) ) )
            // InternalDsl.g:2326:2: ( ( rule__Component__NatureAlternatives_2_0 ) )
            {
            // InternalDsl.g:2326:2: ( ( rule__Component__NatureAlternatives_2_0 ) )
            // InternalDsl.g:2327:3: ( rule__Component__NatureAlternatives_2_0 )
            {
             before(grammarAccess.getComponentAccess().getNatureAlternatives_2_0()); 
            // InternalDsl.g:2328:3: ( rule__Component__NatureAlternatives_2_0 )
            // InternalDsl.g:2328:4: rule__Component__NatureAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__NatureAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNatureAlternatives_2_0()); 

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
    // $ANTLR end "rule__Component__NatureAssignment_2"


    // $ANTLR start "rule__ConfigurationItem__NameAssignment_1"
    // InternalDsl.g:2336:1: rule__ConfigurationItem__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConfigurationItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2340:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2341:2: ( RULE_STRING )
            {
            // InternalDsl.g:2341:2: ( RULE_STRING )
            // InternalDsl.g:2342:3: RULE_STRING
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


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalDsl.g:2351:1: rule__Function__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2355:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2356:2: ( RULE_STRING )
            {
            // InternalDsl.g:2356:2: ( RULE_STRING )
            // InternalDsl.g:2357:3: RULE_STRING
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
    // InternalDsl.g:2366:1: rule__Function__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2370:1: ( ( RULE_ID ) )
            // InternalDsl.g:2371:2: ( RULE_ID )
            {
            // InternalDsl.g:2371:2: ( RULE_ID )
            // InternalDsl.g:2372:3: RULE_ID
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
    // InternalDsl.g:2381:1: rule__Activity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2385:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2386:2: ( RULE_STRING )
            {
            // InternalDsl.g:2386:2: ( RULE_STRING )
            // InternalDsl.g:2387:3: RULE_STRING
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
    // InternalDsl.g:2396:1: rule__Activity__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Activity__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2400:1: ( ( RULE_ID ) )
            // InternalDsl.g:2401:2: ( RULE_ID )
            {
            // InternalDsl.g:2401:2: ( RULE_ID )
            // InternalDsl.g:2402:3: RULE_ID
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
    // InternalDsl.g:2411:1: rule__Entity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2415:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2416:2: ( RULE_STRING )
            {
            // InternalDsl.g:2416:2: ( RULE_STRING )
            // InternalDsl.g:2417:3: RULE_STRING
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
    // InternalDsl.g:2426:1: rule__Entity__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2430:1: ( ( RULE_ID ) )
            // InternalDsl.g:2431:2: ( RULE_ID )
            {
            // InternalDsl.g:2431:2: ( RULE_ID )
            // InternalDsl.g:2432:3: RULE_ID
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


    // $ANTLR start "rule__SequenceMessageType__ReturnAssignment_1"
    // InternalDsl.g:2441:1: rule__SequenceMessageType__ReturnAssignment_1 : ( ruleReturnMessage ) ;
    public final void rule__SequenceMessageType__ReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2445:1: ( ( ruleReturnMessage ) )
            // InternalDsl.g:2446:2: ( ruleReturnMessage )
            {
            // InternalDsl.g:2446:2: ( ruleReturnMessage )
            // InternalDsl.g:2447:3: ruleReturnMessage
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
    // InternalDsl.g:2456:1: rule__SequenceMessage__SourceAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SequenceMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2460:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2461:2: ( RULE_STRING )
            {
            // InternalDsl.g:2461:2: ( RULE_STRING )
            // InternalDsl.g:2462:3: RULE_STRING
            {
             before(grammarAccess.getSequenceMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 

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
    // InternalDsl.g:2471:1: rule__SequenceMessage__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2475:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2476:2: ( RULE_STRING )
            {
            // InternalDsl.g:2476:2: ( RULE_STRING )
            // InternalDsl.g:2477:3: RULE_STRING
            {
             before(grammarAccess.getSequenceMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSequenceMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

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
    // InternalDsl.g:2486:1: rule__SequenceMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SequenceMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2490:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2491:2: ( RULE_STRING )
            {
            // InternalDsl.g:2491:2: ( RULE_STRING )
            // InternalDsl.g:2492:3: RULE_STRING
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
    // InternalDsl.g:2501:1: rule__CreateMessage__SourceAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2505:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2506:2: ( RULE_STRING )
            {
            // InternalDsl.g:2506:2: ( RULE_STRING )
            // InternalDsl.g:2507:3: RULE_STRING
            {
             before(grammarAccess.getCreateMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 

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
    // InternalDsl.g:2516:1: rule__CreateMessage__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2520:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2521:2: ( RULE_STRING )
            {
            // InternalDsl.g:2521:2: ( RULE_STRING )
            // InternalDsl.g:2522:3: RULE_STRING
            {
             before(grammarAccess.getCreateMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

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
    // InternalDsl.g:2531:1: rule__CreateMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2535:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2536:2: ( RULE_STRING )
            {
            // InternalDsl.g:2536:2: ( RULE_STRING )
            // InternalDsl.g:2537:3: RULE_STRING
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
    // InternalDsl.g:2546:1: rule__DeleteMessage__SourceAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DeleteMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2550:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2551:2: ( RULE_STRING )
            {
            // InternalDsl.g:2551:2: ( RULE_STRING )
            // InternalDsl.g:2552:3: RULE_STRING
            {
             before(grammarAccess.getDeleteMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getSourceSTRINGTerminalRuleCall_0_0()); 

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
    // InternalDsl.g:2561:1: rule__DeleteMessage__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DeleteMessage__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2565:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2566:2: ( RULE_STRING )
            {
            // InternalDsl.g:2566:2: ( RULE_STRING )
            // InternalDsl.g:2567:3: RULE_STRING
            {
             before(grammarAccess.getDeleteMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeleteMessageAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

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
    // InternalDsl.g:2576:1: rule__DeleteMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__DeleteMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2580:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2581:2: ( RULE_STRING )
            {
            // InternalDsl.g:2581:2: ( RULE_STRING )
            // InternalDsl.g:2582:3: RULE_STRING
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
    // InternalDsl.g:2591:1: rule__ReturnMessage__TargetAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ReturnMessage__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2595:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2596:2: ( RULE_STRING )
            {
            // InternalDsl.g:2596:2: ( RULE_STRING )
            // InternalDsl.g:2597:3: RULE_STRING
            {
             before(grammarAccess.getReturnMessageAccess().getTargetSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReturnMessageAccess().getTargetSTRINGTerminalRuleCall_0_0()); 

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
    // InternalDsl.g:2606:1: rule__ReturnMessage__SourceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ReturnMessage__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2610:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2611:2: ( RULE_STRING )
            {
            // InternalDsl.g:2611:2: ( RULE_STRING )
            // InternalDsl.g:2612:3: RULE_STRING
            {
             before(grammarAccess.getReturnMessageAccess().getSourceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReturnMessageAccess().getSourceSTRINGTerminalRuleCall_2_0()); 

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
    // InternalDsl.g:2621:1: rule__ReturnMessage__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ReturnMessage__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2625:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2626:2: ( RULE_STRING )
            {
            // InternalDsl.g:2626:2: ( RULE_STRING )
            // InternalDsl.g:2627:3: RULE_STRING
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
    // InternalDsl.g:2636:1: rule__ArmTimerMessage__ParticipantAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ArmTimerMessage__ParticipantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2640:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2641:2: ( RULE_STRING )
            {
            // InternalDsl.g:2641:2: ( RULE_STRING )
            // InternalDsl.g:2642:3: RULE_STRING
            {
             before(grammarAccess.getArmTimerMessageAccess().getParticipantSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArmTimerMessageAccess().getParticipantSTRINGTerminalRuleCall_1_0()); 

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
    // InternalDsl.g:2651:1: rule__ArmTimerMessage__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ArmTimerMessage__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2655:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2656:2: ( RULE_STRING )
            {
            // InternalDsl.g:2656:2: ( RULE_STRING )
            // InternalDsl.g:2657:3: RULE_STRING
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
    // InternalDsl.g:2666:1: rule__ParticipantDeactivation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ParticipantDeactivation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2670:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2671:2: ( RULE_STRING )
            {
            // InternalDsl.g:2671:2: ( RULE_STRING )
            // InternalDsl.g:2672:3: RULE_STRING
            {
             before(grammarAccess.getParticipantDeactivationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParticipantDeactivationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // InternalDsl.g:2681:1: rule__Reference__TimelinesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Reference__TimelinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2685:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2686:2: ( RULE_STRING )
            {
            // InternalDsl.g:2686:2: ( RULE_STRING )
            // InternalDsl.g:2687:3: RULE_STRING
            {
             before(grammarAccess.getReferenceAccess().getTimelinesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTimelinesSTRINGTerminalRuleCall_2_0()); 

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
    // InternalDsl.g:2696:1: rule__Reference__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Reference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2700:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2701:2: ( RULE_STRING )
            {
            // InternalDsl.g:2701:2: ( RULE_STRING )
            // InternalDsl.g:2702:3: RULE_STRING
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000138378010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000378002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000038000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});

}